package prog1.lab3.abstract_classes;
import prog1.lab3.enums.*;
import prog1.lab3.abstract_classes.Person;
import java.lang.StringBuilder;
/**
* Асбтрактный класс {@code Detective},
* дающий описание действий Медуницы
* во время поиска Ворчуна.
*/
public abstract class Detective extends Person {
    /** Вероятность найти беглеца. */
    public static final double FINDING_PROBABILITY = 0.50;

    protected Person fugitive;
    // Захотелось воспользоваться блоком инициализации.
    {
        fugitive = null;
    }

    /**
    * Единственный конструктор,
    * вызывающий {@code Person(n, j, s, p)}.
    * @param n - имя персоны
    * @param j - должность персоны
    * @param s - статус персоны
    * @param p - местонахождение персоны
    */
    public Detective(String n, Job j, Status s, Place p) {
        super(n, j, s, p);
    }
    /** @return беглец */
    public Person getFugitive() { return fugitive; }
    /** @return статус поиска */
    public boolean inSearch() {
        if (fugitive == null) { return false; }
        return true;
    }

    /**
    * Абстрактный метод, начинающий поиск беглеца.
    * @param fugitive беглец
    */
    public abstract void startSearch(Person fugitive);
    /** Абстрактный метод, останавливающий поиск беглеца. */
    public abstract void stopSearch();
}