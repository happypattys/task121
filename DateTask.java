package taskone;

public class DateTask {
    
    private byte day;
    private byte month;
    private short year;

    
    public DateTask() {
        
        this(1, 1, 1);
    }

    
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    
   
    public String toString() {
        
        return month + "/" + day + "/" + year;
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            this.day = (byte) d;
            this.month = (byte) m;
            this.year = (short) y;
        } else {
            
            this.day = (byte) 0;
            this.month = (byte) 0;
            this.year = (short) 0;
        }
    }

    
    public int getDay() {
        return day;
    }

    
    public void setDay(int day) {
        
        if (valid(day, this.month, this.year)) {
            this.day = (byte) day;
        } else {
            
            this.day = (byte) 0;
        }
    }

    
    public int getMonth() {
        return month;
    }

    
    public void setMonth(int month) {
        
        if (valid(this.day, month, this.year)) {
            this.month = (byte) month;
        } else {
            
            this.month = (byte) 0;
        }
    }

    
    public int getYear() {
        return year;
    }

   
    public void setYear(int year) {
       
        if (valid(this.day, this.month, year)) {
            this.year = (short) year;
        } else {
            
            this.year = (short) 0;
        }
    }

    
    private boolean valid(int d, int m, int y) {
        
        if (d < 1 || m < 1 || m > 12 || y < 1) {
            System.out.println("Attempting to create a non-valid date " + m + "/" + d + "/" + y + ": Invalid month, day, or year range.");
            return false;
        }

        int maxDays;
        switch (m) {
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                maxDays = 30;
                break;
            case 2: 
                
                if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
                    maxDays = 29; 
                } else {
                    maxDays = 28; 
                }
                break;
            default: 
                maxDays = 31;
                break;
        }

       
        if (d > maxDays) {
            System.out.println("Attempting to create a non-valid date " + m + "/" + d + "/" + y + ": Day exceeds max days for month.");
            return false;
        }
        return true; 
    }

    
    public static void leapYears() {
        for (int i = 1980; i <= 2025; i++) {
            
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.println("The year " + i + " is a leap year");
            }
        }
    }
}

