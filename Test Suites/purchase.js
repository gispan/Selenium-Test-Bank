import junit.framework.Test;
import junit.framework.TestSuite;

public class Purchase {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(Configuration.class);
    suite.addTestSuite(Login to GCP.class);
    suite.addTestSuite(GoTo_Market_Settings.class);
    suite.addTestSuite(Store_Market_Settings.class);
    suite.addTestSuite(Switch to FB user A.class);
    suite.addTestSuite(Open Market.class);
    suite.addTestSuite(Login via FB.class);
    suite.addTestSuite(Store Seller Balance.class);
    suite.addTestSuite(Go_To_Add_Item_page.class);
    suite.addTestSuite(add_item.class);
    suite.addTestSuite(Logout.class);
    suite.addTestSuite(Switch to FB user B.class);
    suite.addTestSuite(Open Market.class);
    suite.addTestSuite(Login via FB.class);
    suite.addTestSuite(Store Buyer Balance.class);
    suite.addTestSuite(search_item.class);
    suite.addTestSuite(Purchase_item.class);
    suite.addTestSuite(Logout.class);
    suite.addTestSuite(Switch to FB user A.class);
    suite.addTestSuite(Open Market.class);
    suite.addTestSuite(Login via FB.class);
    suite.addTestSuite(Go_To_My_Transaction.class);
    suite.addTestSuite(Store expected seller balance.class);
    suite.addTestSuite(Approve_purchase.class);
    suite.addTestSuite(Store Offer Amounts.class);
    suite.addTestSuite(Verify Purchase Amount.class);
    suite.addTestSuite(Go_To_My_Transaction.class);
    suite.addTestSuite(Store Seller Balance.class);
    suite.addTestSuite(Verify Seller Balance.class);
    suite.addTestSuite(Logout.class);
    suite.addTestSuite(Switch to FB user B.class);
    suite.addTestSuite(Open Market.class);
    suite.addTestSuite(Login via FB.class);
    suite.addTestSuite(Go_To_My_Items.class);
    suite.addTestSuite(Item_Received.class);
    suite.addTestSuite(Store expected buyer Balance.class);
    suite.addTestSuite(Store Buyer Balance.class);
    suite.addTestSuite(Verify Buyer Balance.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
