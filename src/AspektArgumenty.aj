public aspect AspektArgumenty {

    pointcut argumenty (String tekst, int i1): call (* *.Klasa1.*napis* (String, int)) && args(tekst,i1);

    before (String t1, int i2): argumenty (t1,i2)
            {
                System.out.println ("Przed metodą z wartoscia: " + t1 + " " + i2);
            }

    after (String t2, int i3): argumenty (t2,i3)
            {
                System.out.println ("Po metodzie z wartoscia: " + t2 + " " + i3);
            }
}
