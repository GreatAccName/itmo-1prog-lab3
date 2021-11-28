package prog1.lab3.enums;
import java.util.Random;
/** Перечисление должностей персон. */
public enum Job {
    /** Должность врача. */
    DOCTOR("врач"),
    /** Должность первокурсника. */
    FRESHMAN("первач"),
    /** Должность пациента. */
    PATIENT("пациент"),
    /** Должность стойкого первокурсника. */
    RESISTANT_FRESHMAN("стрессоустойчивый первач");

    private String title;

    /**
    * Конструктор, создающий статические константы
    * с их наименованием.
    * @param t наименование должности
    */
    Job(String t) { title = t; }
    /**
    * Обязатльный к переопределению метод.
    * @return наименование должности */
    @Override
    public String toString() { return title; }
}