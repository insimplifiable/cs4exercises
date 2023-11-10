public class CityData {
    String cName;
    String cReg;
    int cPop;
    public CityData(String n, String r, int p) {
        cName = n;
        cReg = r;
        cPop = p;
    }
    public void outputData() {
        System.out.println(cName + " is in the " + cReg + " region with a population of " + cPop + " people.");
    }
}
