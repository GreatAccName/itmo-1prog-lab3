package prog1.lab3.heroes;
import prog1.lab3.enums.*;
import prog1.lab3.interfaces.*;
import prog1.lab3.abstract_classes.*;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.util.Random;
/**
* Класс главной героини - Медуницы,
* дающий ее полное описание.
*/
public class Medunica extends Detective implements Detectivable {
    public static PrintStream so = System.out;
    /** Вероятность отпускания беглеца. */
    public static final double LETGO_PROBABILITY = 0.50;
    /** Вероятность отпуска. */
    public static final double VACATION_PROBABILITY = 0.60;

    private Person care;

    // собстрвенные методы
    /**
    * Единственный конструктор,
    * задающий все необходимые параметры.
    * Вызывает {@code Detective(n, j, s, p)}.
    * @param j - должность персоны
    * @param s - статус персоны
    * @param p - местонахождение персоны
    */
    public Medunica(Job j, Status s, Place p) {
        super("Медуница", j, s, p);
        so.print(super.name + " ");
        so.println("занимает должность: "
            + super.job.toString() + " "
            + super.place.getWhere() + ".");
        so.println("Статус Медуницы: "
            + super.status.toString() + ".");
        care = null; // можно удалить
    }
    /**
    * Осмотр персоны.
    * Также может установаить заботу о персоне.
    * @param person осматриваемая персона
    */
    public void inspection(Person person) {
        so.println("Медуница проводит осмотр персоны "
            + person.getName() + ".");
        if (person.getStatus() == Status.SICK) {
            so.println("Медуница диагностирует меланхолию у персоны "
                + person.getName() + ".");
            this.takeCare(person);
        }
        else if (person.getStatus() == Status.HAPPY) {
            so.println("Медуница замечает безмерное счастье "
                + "у персоны " + person.getName() + ".");
        }
    }
    /**
    * Устанавливает заботу о персоне.
    * @param person персона, о которой заботятся
    */
    public void takeCare(Person person) {
        so.println("Медуница позаботится о персоне "
            + person.getName() + ".");
        care = person;
    }
    /** Снимает заботу. */
    public void stopCare() {
        if (care == null) { return; }
        so.println("Медуница прекращает заботу о персоне "
            + care.getName() + ".");
        care = null;
    }
    /**
    * Медуница решается на отдых.
    * @param p место отдыха
    */
    public void vacation(Place p) {
        so.println("Медуница решается на отдых "
            + p.getWhere() + ".");
        this.setStatus(status.TAN);
        this.setPlace(p);
    }

    // методы от Person
    /**
    * Метод, задающий должность персоны.
    * @param j - должность персоны
    */
    @Override
    public void setJob(Job j) {
        so.println("Новая должность Медуницы: "
            + j.toString() + ".");
        super.job = j;
    }
    /**
    * Метод, задающий статус персоны.
    * @param s - статус персоны
    */
    @Override
    public void setStatus(Status s) {
        so.println("Новый статус Медуницы: "
            + s.toString() + ".");
        super.status = s;
    }
    /**
    * Метод, задающий место персоны.
    * @param p - место персоны
    */
    @Override
    public void setPlace(Place p) {
        so.println("Медуница прибывает "
            + p.getTo() + ".");
        super.place = p;
    }

    // методы от Detective
    /**
    * Метод, начинающий поиск беглеца.
    * @param fugitive беглец
    */
    @Override
    public void startSearch(Person fugitive) {
        if (super.fugitive != null) { return; }
        so.println("Медуница начинает поиск персоны "
            + fugitive.getName() + ".");
        super.fugitive = fugitive;
        this.setStatus(Status.ALERT);
        this.setPlace(Place.FOREST);
    }
    /** Метод, останавливающий поиск беглеца. */
    @Override
    public void stopSearch() {
        if (!this.inSearch()) { return; }

        Random generator = new Random();
        double chance = generator.nextDouble();
        if (chance < super.FINDING_PROBABILITY) {
            so.println("Медуница после долгих поисков "
                + "все-таки нашла персону "
                + super.fugitive.getName() + ".");
            
            chance = generator.nextDouble();
            if (chance < LETGO_PROBABILITY) {
                this.letGo();
                this.stopCare();

                this.setPlace(Place.HOSPITAL);
                super.fugitive.setPlace(Place.ITMO);
                super.fugitive.setJob(Job.RESISTANT_FRESHMAN);
            }
            else {
                this.take(super.fugitive, Place.HOSPITAL);

                chance = generator.nextDouble();
                if (chance < Person.GETRESIST_PROBABILITY) {
                    super.getResist(super.fugitive);
                    this.tranquilize(super.fugitive);
                }
                
                this.setPlace(Place.HOSPITAL);
                this.setStatus(Status.SERENITY);
                super.fugitive.setPlace(Place.HOSPITAL);
                super.fugitive.setStatus(Status.SICK);
            }
        }
        else {
            so.println("Медуница бросила поиски персоны "
                + super.fugitive.getName() + ".");
            this.stopCare();
            this.setPlace(Place.HOSPITAL);
            
            chance = generator.nextDouble();
            if (chance < VACATION_PROBABILITY)
                { this.vacation(Place.EGYPT); }

            super.fugitive.setPlace(Place.ITMO);
            super.fugitive.setJob(Job.RESISTANT_FRESHMAN);
        }
        super.fugitive = null;
    }

    // методы от interface Detectivable
    /**
    * Забирает {@code fugitive} в {@code p}.
    * @param fugitive беглец
    * @param p место, куда забирает беглеца
    */
    @Override
    public void take(Person fugitive, Place p) {
        so.println("Медуница забирает персону "
            + fugitive.getName() + " "
            + p.getTo() + ".");
    }
    /**
    * Отпускает {@code fugitive}.
    */
    @Override
    public void letGo() {
        so.println("Медуница отпускает персону "
            + fugitive.getName() + ".");
    }
    /**
    * Всаживает транквилизатор в {@code fugitive}.
    * @param fugitive беглец
    */
    @Override
    public void tranquilize(Person fugitive) {
        so.println("Медуница всаживает транквилизатор в персону "
            + fugitive.getName() + ".");
    }
}