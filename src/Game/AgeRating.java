package Game;

public enum AgeRating {
    L("Adequado para todas as idades."),
    M10("Pode conter cenas de violência e linguagem imprópria moderad."),
    M12("Pode conter cenas de agressão física, insinuação de consumo de drogas e relações sexuais."),
    M14("Pode conter cenas de Agressão física, consumo explícito de drogas e relações sexuais moderadas."),
    M16("Pode conter cenas de consumo de drogas explícito, agressão física intensa e relações sexuais acentuadas"),
    M18("Pode conter cenas de indução e consumo de drogas, violência extrema, suicídio, cenas de sexo explícitas e disturbios psicossomáticos");

    private String description;

    private AgeRating(String description) {
        this.description = description;
    }

    public AgeRating aRating(int i) {
        switch (i) {
            case 1:
                return L;
            case 2:
                return M10;
            case 3:
                return M12;

            case 4:
                return M14;
            case 5:
                return M16;
            case 6:
                return M18;
            default:
                return null;

        }
    }
}
