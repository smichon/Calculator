package mod_1_4_abstract_class;

/*Aby przećwiczyć wykorzystywanie klas abstrakcyjnych w praktyce, stwórz swoje własne zachowanie dla transakcji bankowej.
Załóżmy, że transakcja bankowa zawiera się w 8 metodach, z czego 3 są zawsze po stronie banku (w klasie abstrakcyjnej).
Schemat transakcji bankowej do zaimplementowania:
Prośba o wprowadzenie karty (Bankomat)
Prośba o wprowadzenie kodu PIN (Bankomat)
Prośba o wprowadzenie kwoty do wypłaty (Bankomat)
Informacja o przyjęciu prośby wypłaty przez Bank (Bank)
Sprawdzenie stanu konta (Bank)
Potwierdzenie możliwości wypłaty (Bank)
Wypłacanie gotówki (Bankomat)
Podziękowanie za skorzystanie z usług Banku (Bankomat)
Załóż, że każde z tych działań sygnalizujemy zwykłym println*/

public class Application {

    public static void main(String[] args) {
        ATMOperation operation = new ATMOperation();
        operation.run();
    }
}
