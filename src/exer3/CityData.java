package exer3;

public class CityData {
    private String cName;
    private String cReg;
    private int cPop;
    public CityData(String name, String region, int population) {
        cName = name;
        cReg = region;
        cPop = population;
    }
    public void outputData() {
        System.out.println(cName + " is in the " + cReg + " region with a population of " + cPop + " people.");
    }
}
