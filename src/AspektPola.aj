public aspect AspektPola {

    pointcut zmiana_pola (): set (int *.Klasa1.*);

    before (): zmiana_pola ()
            {
                System.out.println ("Przed zmiana pola");
            }

    after (): zmiana_pola ()
            {
                System.out.println ("Po zmianie pola");
            }

}
