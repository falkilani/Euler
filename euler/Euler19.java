class Euler19 implements Euler {
    int[] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public void execute(){
        int curr = 2; //tuesday on Jan 1 2001;
        int numFirstSundays = 0;
        for(int year = 1901; year <= 2000; year++){
            for(int month = 0; month < 12; month++){
                curr += months[month];
                if(month == 1 && year % 4 == 0) curr++;
                curr %= 7;
                if(curr == 0) numFirstSundays++;
            }
        }
        System.out.println(curr);
        System.out.println(numFirstSundays);
    }
}