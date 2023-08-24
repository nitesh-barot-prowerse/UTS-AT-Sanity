package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class PolicyPage {
    private WebDriver driver;

    public PolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    private By policyIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(5)");

    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnPolicyInformation = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By letterIcon = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[11]");

    private By downloadIcon = By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]");

    private By statusDropDown = By.xpath("//div[@class='ms-parent']");

    private By policyDropDownOption = By.xpath("//div[@class='ms-drop']/ul/li[2]/label/input");

    private By searchButton=By.cssSelector("button[id='SearchGrid']");

    private By fromDateOfPolicy=By.xpath("//div[@id='search']/div[6]/div/span/span/input");

    private By toDateOfPolicy=By.xpath("//div[@id='search']/div[7]/div/span/span/input");

    private By policyDetailsOnDateValue=By.xpath("//div[@id='gridName']/table/tbody[1]/tr[1]");



    //Add claim page

    private By cogIcon=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/ul/li/a");

    private By addClaimIcon=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/ul/li/ul/li[1]/a");

    private By displayedMessageOnAddClaimPage=By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    //Add note window

    private By addNoteIcon=By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]/ul/li/ul/li[2]/a");

    private By titleOfAddNote=By.cssSelector("input[id='Title']");

    private By descriptionOfAddNote=By.cssSelector("textarea[id='Description']");

    private By cancelButton=By.cssSelector("button[value='Cancel']");

    //Quote information page
    private By viewQuoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[14]//ul/li/ul/li[4]/a");

    private By displayedMessageOnViewQuotePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    //Policy information page

    private By cogIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/a");

    private By addClaimIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[1]/a");

    private By addNoteIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[2]/a");

    private By addEndorsementIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[3]/a");

    private By viewQuoteIconOfPolicyInformationPage = By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[5]/a");

    private By cancelPolicyIconOfPolicyInformationPage=By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[6]/a");

    private By cancelPolicyRefundAmount=By.cssSelector("input[id='RefundAmount']");

    private By cancelPolicyDescription=By.cssSelector("textarea[id='CancellationDescription']");

    private By cancelPolicyCancelButton=By.xpath("//div[@class='ibox-content']/div[5]/div/div/div/a[@id='btnCancel']");

    private By addAllocatePaymentIcon=By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[8]/a");

    private By addAccountMaintenanceIcon=By.xpath("//div[@class=' tooltip-demo pull-right']/div/div/div/div/div/div/ul/li[11]/a");

    private By displayedMessageOnPolicyEndorsementPage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnQuoteInformationPage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnAddAllocatePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By displayedMessageOnAddAccountMaintenancePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    //All tab on policy information page

    private By transactionalTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[1]");

    private By detailsOfTransactionTab=By.xpath("//div[@id='gridPolicyActivityList']/table/tbody/tr");

    private By insurerTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[2]");

    private By detailsOfInsurerTab=By.xpath("//div[@id='gridPolicyTransactionInsurerList']/table/tbody/tr");

    private By claimTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]");

    private By detailsOfClaimTab=By.xpath("//div[@id='gridPolicyClaimList']/table/tbody/tr");

    private By reversalClaimTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[4]");

    private By detailsOfReversalClaimTab=By.xpath("//div[@id='gridPolicyClaimReversalInvoiceList']/table/tbody/tr");

    private By creditNoteTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[5]");

    private By detailsOfCreditNoteTab=By.xpath("//div[@id='gridPolicyCreditNoteList']/table/tbody/tr");

    private By policyInvoiceCreditNoteTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[6]");

    private By detailsOfPolicyInvoiceCreditNoteTab=By.xpath("//div[@id='gridNamePolicyInvoiceCreditNote']/table/tbody/tr");

    private By notesTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[7]");

    private By detailsOfNotesTab=By.xpath("//div[@id='gridNameNotes']/table/tbody/tr");

    private By installmentTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[8]");

    private By detailsOfInstallmentTab=By.xpath("//div[@id='gridPolicyInstalmentList']/table/tbody/tr");

    private By exclusionTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[9]");

    private By detailsOfExclusionTab=By.xpath("//div[@id='gridName']/table/tbody/tr");

    private By historyTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[12]");

    private By detailsOfHistoryTab=By.xpath("//div[@id='gridPolicyHistoryList']/table/tbody/tr");

    private By policyLedgerTab=By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[13]");

    private By detailsOfPolicyLedgerTab=By.xpath("//div[@id='gridPolicyDebtorLedgerList']/table/tbody/tr");

    public void clickPolicyIcon() {
        driver.findElement(policyIcon).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyManagePolicyPage() {
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    public String verifyDateFormatOfStartDate() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> policyDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]")));
        String dateArray = " ";
        for (WebElement startDate : policyDateColumn) {
            dateArray = dateArray + " " + startDate.getText().toString();

        }
        return dateArray;
    }

    public String verfiyDateFormatOfExpireDate() {
        WebDriverWait eWait = new WebDriverWait(driver, 10);
        List<WebElement> endDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String dateArray = " ";
        for (WebElement endDate : endDateColumn) {
            dateArray = dateArray + " " + endDate.getText().toString();
        }
        return dateArray;

    }

    public String clickOnPolicyNumberLink() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[3]/a")));
        String displayMessage=" ";
        for (WebElement cEle : totalColumn) {
            cEle.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println(driver.getCurrentUrl());
            displayMessage=displayMessage+driver.findElement(displayedMessage).getText();

            driver.close();
            driver.switchTo().window(tabs2.get(0));
           // break;

        }
        return displayMessage;

    }

    public String verifyPolicyInformationPage() {
        return driver.findElement(displayedMessageOnPolicyInformation).getText();

    }
    public void clickPolicyPageToDownloadFile()
    {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[3]/a")));

        for (WebElement cEle : totalColumn) {
            cEle.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println(driver.getCurrentUrl());
            break;

        }

    }

    public void LetterIcon() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(letterIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void DownloadIcon() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(downloadIcon));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait dWait = new WebDriverWait(driver, 10);
        List<WebElement> totalDownLoadSymbol = dWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridPolicyLetterList']/table/tbody/tr/td[14]/div/a[1]")));
        int dSize = totalDownLoadSymbol.size();

        for (int i = 0; i < dSize; i++) {
            totalDownLoadSymbol.get(i).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }

        //driver.switchTo().window(tabs2.get(0));
    }

    public String verifyDownLoadFile() {
        File myfile = new File("C:/Users/prowe/Downloads/BPIS Document - Welcome Letter.pdf");
        //FileUtils.touch(myfile);
        String re = "";

        if (myfile.exists()) {
            re = "file exist";

        } else {

            System.out.println("The file does not exist");
        }
        return re;
    }
 //Check appropriate policy data should displays against option selected from status drop down on manage policy page
    public void selectOptionFromStatusDropDown() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = driver.findElement(statusDropDown);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(policyDropDownOption).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyPolicyStatusUponDropDown() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> policyStatus = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr")));
        String Status = " ";
        for (WebElement status : policyStatus) {
            Status = status.getText();
        }
        return Status;
    }

    //Filter policy details on manage policy page upon from and to date value of policy  on manage policy page

    public void enterFromAndToDateValueOfPolicy(){
        driver.findElement(fromDateOfPolicy).sendKeys("23.06.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(toDateOfPolicy).sendKeys("20.06.2025");
    }

    public void clickOnSearchButtonOnManagePolicyPage(){
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyDetails(){
        return driver.findElement(policyDetailsOnDateValue).getText();
    }

    //Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page

    public void clickOnAddClaimPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addClaimIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddClaimPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;
    }


    //Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page

    public void clickOnAddNoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addNoteIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void verifyAddNoteWindow() {
        driver.findElement(titleOfAddNote).sendKeys("Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(descriptionOfAddNote).sendKeys("Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cancelButton).click();
    }

    //Verify that quote information page should open with all details by clicking on view quote icon of cog drop down against policy number on manage policy page

    public void clickOnViewQuoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(viewQuoteIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyQuoteInformationPage() {
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnViewQuotePage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;
    }

    //Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page

    public void clickOnAddClaimOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addClaimIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Add note window displays with all details by clicking add note icon of cog drop down on policy information page

    public void clickOnAddNoteOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addNoteIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page

    public void clickOnAddEndorsementOnPolicyInformation() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addEndorsementIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyEndorsementPage(){

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnPolicyEndorsementPage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;


    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectViewQuoteIcon(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(viewQuoteIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyQuoteInfoPage(){
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnQuoteInformationPage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    // Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page

    public void selectCancelPolicyIcon(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cancelPolicyIconOfPolicyInformationPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void verifyCancelPolicyWindow(){


      /*  driver.findElement(cancelPolicyRefundAmount).sendKeys("123.98");
        driver.findElement(cancelPolicyDescription).sendKeys("Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        driver.findElement(cancelPolicyCancelButton).click();

    }

    //Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page

    public void selectAddAllocateIcon(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addAllocatePaymentIcon).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddAllocatePage(){

        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnAddAllocatePage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    //Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page
    public void selectAddAccountMaintenanceIcon(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIconOfPolicyInformationPage)).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addAccountMaintenanceIcon).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyClientAccountMaintenancePage(){
        String displayMessage = " ";
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        displayMessage = displayMessage + driver.findElement(displayedMessageOnAddAccountMaintenancePage).getText();

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return displayMessage;

    }

    //Verify appropriate details should reflect by clicking on  transactions tab on policy information page

    public void clickOnTransactionTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(transactionalTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfTabsOnPolicyInformationPage(){
        return driver.findElement(detailsOfTransactionTab).getText();

    }

    //Verify appropriate details should reflect by clicking on insurer tab on policy information page

    public void clickOnInsurerTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(insurerTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfInsurerTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfInsurerTab).getText();

    }

    //Verify appropriate details should reflect by clicking on claim tab on policy information page

    public void clickOnClaimTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(claimTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfClaimTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfClaimTab).getText();

    }

    //Verify appropriate details should reflect by clicking on reversal claim tab on policy information page
    public void clickOnReversalClaimTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(reversalClaimTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfReversalClaimTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfReversalClaimTab).getText();

    }

    //Verify appropriate details should reflect by clicking on credit note tab on policy information page

    public void clickOnCreditNoteTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(creditNoteTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfCreditNoteTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfCreditNoteTab).getText();

    }

    //Verify appropriate details should reflect by clicking on policy invoice credit note tab on policy information page

    public void clickOnPolicyInvoiceCreditNoteTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(policyInvoiceCreditNoteTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfPolicyInvoiceCreditNoteTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfPolicyInvoiceCreditNoteTab).getText();

    }

    //Verify appropriate details should reflect by clicking on policy notes tab on policy information page

    public void clickOnNotesTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(notesTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfNotesTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfNotesTab).getText();

    }

    //Verify appropriate details should reflect by clicking on policy  installment tab on policy information page

    public void clickOnInstallmentTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(installmentTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfInstallmentTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfInstallmentTab).getText();

    }

    //Verify appropriate details should reflect by clicking on policy exclusion tab on policy information page

    public void clickOnExclusionTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(exclusionTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfExclusionTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfExclusionTab).getText();

    }

    //Verify appropriate details should reflect by clicking on history tab on policy information page

    public void clickOnHistoryTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(historyTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfHistoryTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfHistoryTab).getText();

    }

    //Verify appropriate details should reflect by clicking on policy ledger tab on policy information page

    public void clickOnPolicyLedgerTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(policyLedgerTab).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyDetailsOfPolicyLedgerTabOnPolicyInformationPage(){
        return driver.findElement(detailsOfPolicyLedgerTab).getText();

    }


}
