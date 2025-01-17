public class ProductHandling {

    public static void main(String[] args) {
        ProductHandling ph = new ProductHandling();
        ph.getProductDetails(125);
    }
   
 public void getProductDetails(int ProductId){
 
    try {

        if (ProductId>100) {

            throw  new ProductException("Invalid product id ");
            
        }

        else
        {
            System.out.println("Found Product");
        }

    } catch ( ProductException ex)  {
        System.out.println(ex.getMessage());
        
    }
    
 }

 public void checkInventoryDeatails(int ProductId, int Quantity ){


 }

 public void processPayment(int ProductId, int Quantity, int price ){



 }

    }
