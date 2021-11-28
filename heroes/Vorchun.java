package prog1.lab3.heroes;
import prog1.lab3.enums.*;
import prog1.lab3.interfaces.*;
import prog1.lab3.abstract_classes.Person;
import java.lang.StringBuilder;
import java.io.PrintStream;
/**
* Класс главного героя - Ворчуна,
* дающий его полное описание.
*/
public class Vorchun extends Person implements Fugitivable {
    public static PrintStream so = System.out;

    // собстрвенные методы
    /**
    * Единственный конструктор Ворчуна,
    * задающий все необходимые параметры.
    * Вызывает {@code Person(n, j, s, p)}.
    * @param j - должность персоны
    * @param s - статус персоны
    * @param p - местонахождение персоны
    */
    public Vorchun(Job j, Status s, Place p) {
        super("Ворчун", j, s, p);
        so.print(super.name + " ");
        so.println("занимает должность: "
            + super.job.toString() + " "
            + super.place.getWhere() + ".");
        so.println("Статус Ворчуна: "
            + super.status.toString() + ".");
    }
    /** Смотрит с наслаждением. Вызывает счастье. */
    public void look() {
        so.println("Ворчун с наслаждением глядит "
            + "на свежую зеленую траву и "
            + "на прозрачное синее небо.");
        this.setStatus(Status.HAPPY);
    }
    /** Дает себе обещание. */
    public void promise() {
        so.println("Ворчун пообещал себе "
        + "никогда не ворчать и быть довольным "
        + "всем на свете, если только вновь "
        + "не окажется в больнице BloodyHospital.");
    }

    // методы от Person
    /**
    * Метод, задающий должность персоны.
    * @param j - должность персоны
    */
    @Override
    public void setJob(Job j) {
        so.println("Новая должность Ворчуна: "
            + j.toString() + ".");
        super.job = j;
    }
    /**
    * Метод, задающий статус персоны.
    * @param s - статус персоны
    */
    @Override
    public void setStatus(Status s) {
        so.println("Новый статус Ворчуна: "
            + s.toString() + ".");
        super.status = s;
    }
    /**
    * Метод, задающий место персоны.
    * @param p - место персоны
    */
    @Override
    public void setPlace(Place p) {
        so.println("Ворчун прибывает "
            + p.getTo() + ".");
        super.place = p;
    }

    /** Принимает решение о побеге. */
    public void escapeDecision() {
        so.println("Ворчун решается на побег.");
    }
    /** Крадет одежду. */
    public void stealClothes() {
        so.println("Ворчун крадет одежду.");
    }
    /** Прячется. */
    public void hide() {
        so.println("Ворчун присаживается и притаивается.");
    }
}