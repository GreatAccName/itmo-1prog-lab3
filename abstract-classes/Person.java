package prog1.lab3.abstract_classes;
import prog1.lab3.enums.*;
import java.lang.StringBuilder;
/**
* Асбтрактный класс {@code Person},
* дающий базовое описание для персон рассказа.
*/
public abstract class Person {
    /** Вероятность ощутить сопротивление. */
    public static final double GETRESIST_PROBABILITY = 0.70;

    protected String name;
    protected Job job;
    protected Status status;
    protected Place place;

    /**
    * Единственный конструктор,
    * задающий все необходимые параметры.
    * @param n - имя персоны
    * @param j - должность персоны
    * @param s - статус персоны
    * @param p - местонахождение персоны
    */
    public Person(String n, Job j, Status s, Place p) {
        name = n;
        job = j;
        status = s;
        place = p;
    }
    /**
    * Оказание сопротивления.
    * @param person получает сопротивление
    */
    public void getResist(Person person) {
        System.out.println(this.getName()
            + " ощущает сопротивление от персоны "
            + person.getName() + ".");
    }
    /** @return имя персоны */
    public String getName() { return name; }
    /** @return должность персоны */
    public Job getJob() { return job; }
    /** @return статус персоны */
    public Status getStatus() { return status; }
    /** @return место персоны */
    public Place getPlace() { return place; }

    /**
    * Абстрактный метод, задающий должность персоны.
    * @param j - должность персоны
    */
    public abstract void setJob(Job j);
    /**
    * Абстрактный метод, задающий статус персоны.
    * @param s - статус персоны
    */
    public abstract void setStatus(Status s);
    /**
    * Абстрактный метод, задающий место персоны.
    * @param p - место персоны
    */
    public abstract void setPlace(Place p);
}