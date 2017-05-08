## Домашнее задание

1. Создать свою структуру данных, аналагичную **ArrayList**:
  * Добавление элемента в конец и по индексу. 
  * Метод для взятия объекта по индексу
  * Удаление элемента по его индексу
  * Проверка, пуст ли список
  * Метод, возвращающий размер списка
  * Остальные методы будем добавлять по мере необходимости
  * Не забудьте о том, что необходимо расширять массив, если вам не хватает места!
2. Начать разрабатывать ваш проект (если вы готовы) - например, создать класс для хранения задачи или сделать простой вариант со строками и массивами. Желательно записать где-то план по вашему проекту - что вы хотите сделать. Можно скинуть его преподавателям. 

### Дополнительное задание

1. Реализовать свою структуру типа [Cтек](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B5%D0%BA). Желательно на основе структуры [односвязный список](https://ru.wikipedia.org/wiki/%D0%A1%D0%B2%D1%8F%D0%B7%D0%BD%D1%8B%D0%B9_%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA) (не путать с типом List). Если вы делаете его на основе массива, то стоит позаботиться о ситуации, когда количество элементов превосходит ваш массив.
1. Создать [односвязный список](https://ru.wikipedia.org/wiki/%D0%A1%D0%B2%D1%8F%D0%B7%D0%BD%D1%8B%D0%B9_%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA) с возможностью его развернуть в обратную сторону за один проход


## Задания на полиморфизм и инкапсуляцию
Ниже приведен код (обращайте внимание на то, в каких пакетах должны располагаться классы!). Надо решить две задачи: 
1. Полиморфизм. Необходимо реализовать методы HRDepartment#departmentsCertificate и ITDepartment#departmentsCertificate (напечатать имена всех под-отделов) так, чтобы вместо работы с каждым отдельным типом Admins, Support и проч. вы работали со всеми через единый интерфейс. 
2. Инкапсуляция. Изменить следующие методы (уровень доступа) так, чтобы выполнялись требования:
  * HRDepartment#issueCertificate был виден в любом отделе
  * HRDepartment#addNewEmployee был недоступен для других отделов
  * Геттеры и сеттеры SubDepartment#name были доступны всем
  * SubDepartment#moveEmployeeToProject был доступен не только самому текущему отделу, но и ITDepartment. Однако он не должен быть доступен HRDepartment
  * SubDepartment#setupCurrentProjects должен быть недоступен даже для наследников SubDepartment
  * SubDepartment#currentProjects должен быть доступен наследникам класса, но точно не должен быть доступен за пределами пакета it.
Здесь не забудьте внимательно проверить так же и Override'ы, поправить соответствующие модификаторы там.


```java
package com.levelp.hr;

import com.levelp.it.ITDepartment;

import java.util.ArrayList;
import java.util.List;

public class HRDepartment {

    public HRDepartment() {
        addNewEmployee("Alex");
        addNewEmployee("Irina");
        addNewEmployee("Kirill");
    }

    private List<String> employees = new ArrayList<>();

    public String issueCertificate(String name) {
        if (employees.contains(name)) {
            return "Mr. " + name + " works here!";
        }
        return null;
    }

    public void addNewEmployee(String name) {
        employees.add(name);
    }

    public void departmentsCertificate(ITDepartment itDepartment) {
        // add your code here
    }

}


package com.levelp.it.sub;

import com.levelp.it.Project;
import com.levelp.it.SubDepartment;

import java.util.Collections;
import java.util.List;

public class Admins extends SubDepartment {
    public Admins() {
        super("Admins");
    }


    @Override
    public List<Project> currentProjects() {
        return Collections.singletonList(
                new Project("infrastructure", "Alex", "Ivan", "Pavel")
        );
    }
}
package com.levelp.it.sub;

import com.levelp.it.Project;
import com.levelp.it.SubDepartment;

import java.util.Arrays;
import java.util.List;

public class Developers extends SubDepartment {
    public Developers() {
        super("R&D");
    }

    @Override
    public List<Project> currentProjects() {
        return Arrays.asList(
                new Project("Web", "Ekaterina", "Igor"),
                new Project("Back-end", "Konstantin")
        );
    }
}


package com.levelp.it.sub;

import com.levelp.it.Project;
import com.levelp.it.SubDepartment;

import java.util.Arrays;
import java.util.List;

public class Support extends SubDepartment {
    public Support() {
        super("Support");
    }

    @Override
    public List<Project> currentProjects() {
        return Arrays.asList(
                new Project("level 0", "Kate"),
                new Project("level 1", "Alex"),
                new Project("level 2", "Marina")
        );
    }
}


package com.levelp.it;

import com.levelp.it.sub.Admins;
import com.levelp.it.sub.Developers;
import com.levelp.it.sub.Support;

import java.util.List;

public class ITDepartment {
    private Developers developers = new Developers();
    private Admins admins = new Admins();
    private Support support = new Support();


    public List<SubDepartment> getAllSubDepartments() {
        // add your code here

        return null;
    }

}
package com.levelp.it;

import java.util.Arrays;
import java.util.List;

public class Project {
    private String name;
    private List<String> employees;

    public Project(String name, String... employees) {
        this.name = name;
        this.employees = Arrays.asList(employees);
    }

    public String getName() {
        return name;
    }

    public List<String> getEmployees() {
        return employees;
    }
}


package com.levelp.it;

import java.util.HashMap;
import java.util.List;

public abstract class SubDepartment {
    private String name;
    private HashMap<String, String> projects = new HashMap<>();

    public SubDepartment(String name) {
        this.name = name;
        setupCurrentProjects(currentProjects());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveEmployeeToProject(String name, String project) {
        projects.put(name, project);
    }

    public void setupCurrentProjects(List<Project> projects) {
        for (Project project : projects) {
            for (String employeeName : project.getEmployees()) {
                moveEmployeeToProject(employeeName, project.getName());
            }
        }
    }

    public abstract List<Project> currentProjects();
}



```
