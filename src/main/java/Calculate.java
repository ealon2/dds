public class Calculate {
    public static double getAmount(Article article) {

        if (article.getState() == States.SETTLEMENT) return baseAmount*0.50;
            else if (article.getState() == States.INCENTIVE) return baseAmount*0.50;
                else return baseAmount;
    }
}
