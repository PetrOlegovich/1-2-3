public enum RelationShips {
    PARENT( "Родители"),
    WIFE("Жена"),
    HUSBANT("Муж"),
    BROTHER("Брат"),
    SISTER("Сестра"),
    FATHER("Отец"),
    SON("Сын"),
    CHILDREN("Дети");
    private String description;

    RelationShips(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

}
