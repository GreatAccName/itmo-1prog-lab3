package prog1.lab3.interfaces;
import prog1.lab3.abstract_classes.Person;
import prog1.lab3.enums.*;

/** Интерфейс описания дополнительных возможностей Медуницы. */
public interface Detectivable {
    /**
    * Забирает {@code fugitive} в {@code p}.
    * @param fugitive беглец
    * @param p место, куда забирает беглеца
    */
    public void take(Person fugitive, Place p);
    /**
    * Отпускает {@code fugitive}.
    */
    public void letGo();
    /**
    * Всаживает транквилизатор в {@code fugitive}.
    * @param fugitive беглец
    */
    public void tranquilize(Person fugitive);
}