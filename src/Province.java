public class Province {
    private String name;
    private String capital;
    private long population;

    public static final int DEFAULT_POPULATION = 4648055;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    public static final String[] PROVINCES = {"Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan", "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island"};
    public static final String[] CAPITALS = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina", "Halifax", "Fredericton", "St. John's", "Charlottetown"};

    // constructor
    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name)) && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.name = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return the population
     */
    public long getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    public String getDetails() {
        return String.format("The capital of %s (population. %d) is %s.", name, population, capital);
    };

    private boolean isValidProvince(String province) {
        for (String p : PROVINCES) {
            if (p == province) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation(long population) {
        if (30000 < population && population < 15000000) {
            return true;
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        for (String c : CAPITALS) {
            if (c == capital) {
                return true;
            }
        }
        return false;
    }
}
