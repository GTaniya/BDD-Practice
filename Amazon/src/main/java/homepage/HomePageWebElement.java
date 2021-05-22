package homepage;

public class HomePageWebElement {

    public static final String WEB_ELEMENT_TOYS_AND_GAMES = "//a[normalize-space()='Toys & Games']";
    public static final String WEB_ELEMENT_ART_AND_CRAFTS = "//span[.='Arts & Crafts']";
    public static final String WEB_ELEMENT_CRAFT_KITS = "//span[@class='a-size-base a-color-base'][normalize-space()='Craft Kits']";
    public static final String WEB_ELEMENT_FREE_SHIPPING = "//div[@id='primeRefinements']//i[@class='a-icon a-icon-checkbox']";
    public static final String WEB_ELEMENT_CRAFTS_HEADER = "//span[@class='a-color-state a-text-bold']";


    public static final String WEB_ELEMENT_PRIME = "//a[@id='nav-link-prime']//span[contains(text(),'Prime')]";
    public static final String WEB_ELEMENT_TRY_PRIME = "//input[@class='prime-cta-signup-button-input']";
    public static final String WEB_ELEMENT_SIGN_IN_BUTTON = "//input[@id='signInSubmit']";
    public static final String WEB_ELEMENT_SIGN_IN_HEADER = "//input[@id='signInSubmit']";


    public static final String WEB_ELEMENT_SEARCH_BAR = "//input[@id='twotabsearchtextbox']";


    public static final String WEB_ELEMENT_BOOKS = "//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='Books']";

    public static String getBookCategoriesLocator (String bookCategories){
        return "//div[@data-value='"+bookCategories+"']//img[@role='presentation']";
    }

    public static String getPageHeaderLocators (String pageHeaders){
        return "//b[normalize-space()='"+pageHeaders+"']";
    }





}
