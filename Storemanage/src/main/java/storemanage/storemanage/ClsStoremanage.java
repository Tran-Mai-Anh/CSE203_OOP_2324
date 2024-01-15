/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package storemanage.storemanage;

/**
 *
 * @author maianhtran
 */
public class ClsStoremanage {

    public static void main(String[] args) {
        Listproduct productList = new Listproduct();
        productList.InpuListproduct();
        //product.OutputListproduct();
        //product.ProductLessThan100();
        productList.SortProductByDate();
    }
}
