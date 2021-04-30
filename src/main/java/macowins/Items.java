package macowins;

import java.util.Date;

public class Items {

    private Article article = null;
    private Date billingDate = null;
    private final Double amount = 0.00;
    private PaymentMethod paymentMethod = PaymentMethod.CASH;

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Double getBaseAmount(){
        return (article.getBasePrice()*this.amount);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
