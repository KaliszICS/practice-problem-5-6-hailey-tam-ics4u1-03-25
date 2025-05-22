class Display {
    private double sizeInches;
    private String resolution;
    private boolean displayStatus;

    public Display(double sizeInches, String resolution){
        this.sizeInches = sizeInches;
        this.resolution = resolution;
        this.displayStatus = false;
    }

    public String turnOn(){
        this.displayStatus = true;
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
    }

    public String turnOff(){
        this.displayStatus = false;
        return "Display turned off.";
    }

    public double getSizeInches(){
        return this.sizeInches;
    }

    public String getResolution(){
        return this.resolution;
    }

    public boolean getDisplayStatus(){
        return this.displayStatus;
    }

    @Override
    public String toString(){
        return "Display: " + this.sizeInches + " inches, " + this.resolution;
    }
}