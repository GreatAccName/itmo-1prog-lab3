package prog1.lab3.interfaces;
import prog1.lab3.abstract_classes.Person;
import prog1.lab3.enums.*;

/** Интерфейс описания дополнительных возможностей Ворчуна. */
public interface Fugitivable {
    /** Принимает решение о побеге. */
    public void escapeDecision();
    /** Крадет одежду. */
    public void stealClothes();
    /** Прячется. */
    public void hide();
}