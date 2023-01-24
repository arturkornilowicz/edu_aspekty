public aspect AspektLog {

    pointcut logowanie (): call (* *.*.* (int,..));

    before (): logowanie ()
            {
                System.out.println ("Przed metodą");
            }

    after (): logowanie ()
            {
                System.out.println ("Po metodzie");
            }
}
