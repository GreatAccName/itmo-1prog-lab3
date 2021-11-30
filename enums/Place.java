package prog1.lab3.enums;
import java.util.Random;
/** Класс мест персон. */
public class Place {
    public static final String h1 = "в больнице BloodyHospital";
    public static final String h2 = "в больницу BloodyHospital";
    public static final String i1 = "в ИТМО на ИВТ";
    public static final String i2 = "в ИТМО на ИВТ";
    public static final String f1 = "в лесочке";
    public static final String f2 = "в лесочек";
    public static final String t1 = "в зарослях лопуха";
    public static final String t2 = "в заросли лопуха";
    public static final String e1 = "в Египте";
    public static final String e2 = "в Египет";
    private String where;
    private String to;

    /**
    * Открытый конструктор для создания
    * статических констант места с падежами.
    * @param w предложный падеж места
    * @param t винительный падеж места
    */
    public Place(String w, String t) {
        where = w;
        to = t;
    }
    /** @return предложный падеж места */
    public String getWhere() { return where; }
    /** @return винительный падеж места */
    public String getTo() { return to; }
    
    /** Место: больница. */
    public static Place HOSPITAL = new Place(h1, h2);
    /** Место: университет ИТМО, кафедра ИВТ. */
    public static Place ITMO = new Place(i1, i2);
    /** Место: лес. */
    public static Place FOREST = new Place(f1, f2);
    /** Место: заросли лопуха. */
    public static Place THICKETS = new Place(t1, t2);
    /** Место: Египет. */
    public static Place EGYPT = new Place(e1, e2);

    /**
    * Обязатльный к переопределению метод.
    * @return винительный падеж места */
    @Override
    public String toString() { return to; }
    /**
    * Обязатльный к переопределению метод.
    * @return числовое значение объекта */
    @Override
    public int hashCode() {
        return 1 * to.hashCode() + 2 * where.hashCode();
    }
    /**
    * Обязатльный к переопределению метод.
    * @param p место для сравнения
    * @return {@code true} если объекты равны,
    * иначе - {@code false}
    */
    @Override
    public boolean equals(Object p) {
        if (p == null) { return false; }
        if (this == p) { return true; }
        if ( !(p instanceof Place) ) { return false; }
        return ( (Place)p ).to.equals(to)
            && ( (Place)p ).where.equals(where);
    }
}