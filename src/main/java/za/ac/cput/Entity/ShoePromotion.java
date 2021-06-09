/*  ShoePromotion.java
    Entity for a Shoe Promotion
    Author: Keenan Barends (219002959)
    Date: 09 June 2021
 */

package za.ac.cput.Entity;

public class ShoePromotion {

    private int shoeId;
    private int promotionId;
    private String startDate;
    private String endDate;

    private ShoePromotion(Builder builder)
    {
        this.shoeId = builder.shoeId;
        this.promotionId = builder.promotionId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

   public static class Builder{

       private int shoeId;
       private int promotionId;
       private String startDate;
       private String endDate;
       
       public Builder setShoeId(int shoeId)
       {
           this.shoeId = shoeId;
           return this;
       }
       
       public Builder setPromotion(int promotionId)
       {
           this.promotionId = promotionId;
           return this;
       }

       public Builder setStartDate(String startDate)
       {
           this.startDate = startDate;
           return this;
       }
       
       public Builder setEndDate(String endDate)
       {
           this.endDate = endDate;
           return this;
       }

       public ShoePromotion build()
       {
           return new ShoePromotion(this);
       }

       public Builder copy(ShoePromotion shoePromotion)
       {
           this.shoeId = shoePromotion.shoeId;
           this.promotionId = shoePromotion.promotionId;
           this.startDate = shoePromotion.startDate;
           this.endDate = shoePromotion.endDate;

           return this;
       }
   }

    @Override
    public String toString() {
        return "ShoePromotion{" +
                "shoeId=" + shoeId +
                ", promotionId=" + promotionId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}