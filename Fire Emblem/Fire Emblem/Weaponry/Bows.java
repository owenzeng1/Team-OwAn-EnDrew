public interface Bow{
    private String weaponType = "B";
    abstract int might;
    abstract int hitRate;
    abstract int critRate;
    public String getWeaponType(){
        return weaponType;
    }
}
    
    