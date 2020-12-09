package ca.sheridancollege.prog;


public enum Unit {
    
    EACHES("ea","Eaches"),
    MILLIGRAM("mg","Milligram"),
    GRAMS("g","Grams"),
    KILOGRAMS("kg", "Kilograms"),
    MILLILITER("mL","Milliliter"),
    LITER("L","Liter");
    
    private String symbol;
    private String name;
        
    Unit(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}
