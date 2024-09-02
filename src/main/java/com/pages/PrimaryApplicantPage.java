package com.pages;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.browser.DriverManager;

public class PrimaryApplicantPage extends BasePage {
	public PrimaryApplicantPage(Hashtable<String, String> data) {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	@FindBy(xpath = "//span[text()='New Application']")
	private WebElement newApplication;
	@FindBy(xpath = "(//i[@class='caret pull-right'])[1]")
	private WebElement loantype;
	@FindBy(id = "2873304084650")
	private WebElement select;
	@FindBy(xpath = "//span[text()='Select a branch']")
	private WebElement branch;
	@FindBy(xpath = "//div[text()='Acworth GA']")
	private WebElement branchname;
	@FindBy(id = "formly_2_input_primaryApplicant.SSN_")
	private WebElement sSN;
	@FindBy(xpath = "//span[text()='Customer Lookup']")
	private WebElement customerlookup;
	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[2]")
	private WebElement interaction;
	@FindBy(xpath = "//div[text()='In Person']")
	private WebElement interactionType;
	@FindBy(id = "formly_2_dl4Number_loanInformation.loanVersions[0].xInitialAmountRequested_")
	private WebElement initialAmount;
	@FindBy(xpath = "(//span[@aria-label='Select box activate'])[3]")
	private WebElement reasonforloan;
	@FindBy(xpath = "//div[text()='Auto Purchase']")
	private WebElement loanreason;
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[4]")
	private WebElement authorize;
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[6]")
	private WebElement referral;
	@FindBy(id = "formly_2_input_primaryApplicant.xReferralName_")
	private WebElement referralName;
	@FindBy(id = "formly_2_input_primaryApplicant.firstName_")
	private WebElement firstName;
	@FindBy(id = "formly_2_input_primaryApplicant.middleName_")
	private WebElement middleName;
	@FindBy(id = "formly_2_input_primaryApplicant.lastName_")
	private WebElement lastName;
	@FindBy(id = "formly_12_ui-select_primaryApplicant.suffix_")
	private WebElement suffix;
	@FindBy(xpath = "//div[text()='Fourth']")
	private WebElement suffixtype;
	@FindBy(xpath = "(//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty ng-valid-required ng-valid-maxlength'])[1]")
	private WebElement preferredName;
	@FindBy(id = "formly_2_datepicker_primaryApplicant.dateOfBirth_")
	private WebElement dateofBirth;
	@FindBy(id = "formly_2_dl4Number_primaryApplicant.xNumberOfDependants_")
	private WebElement numberofDependents;
	@FindBy(id = "formly_2_input_primaryApplicant.xAgeOfDependants_")
	private WebElement agesofDependents;
	@FindBy(id = "formly_2_input_primaryApplicant.homePhone_")
	private WebElement homePhone;
	@FindBy(id = "formly_2_input_primaryApplicant.mobilePhone_")
	private WebElement mobilePhone;
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty ng-valid-required ng-valid-maxlength ng-valid-primary-applicant.email']")
	private WebElement email;
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[13]")
	private WebElement employee;
	@FindBy(xpath = "(//button[@class='btn btn-info btn-sm'])[1]")
	private WebElement addAddress;
	@FindBy(id = "primaryApplicant.addresses_addressLine1_addressLine1primaryApplicant.addresses-0")
	private WebElement address;
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-maxlength ng-valid-address-line1']")
	private WebElement addressLine;
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty ng-valid-required ng-valid-maxlength ng-valid-address-line2']")
	private WebElement addressLine2;
	@FindBy(id = "primaryApplicant.addresses_postalCode_postalCodeprimaryApplicant.addresses-0")
	private WebElement zipcode;
	@FindBy(id = "primaryApplicant.addresses_yearsAtResidence_formly_8_dl4Number_yearsAtResidence_primaryApplicant.addresses-0")
	private WebElement YearsAtResidence;
	@FindBy(id = "primaryApplicant.addresses_monthsAtResidence_formly_8_dl4Number_monthsAtResidence_primaryApplicant.addresses-0")
	private WebElement MonthsAtResidence;
	@FindBy(id = "primaryApplicant.addresses_ownershipType_ownershipTypeprimaryApplicant.addresses-0")
	private WebElement ownership;
	@FindBy(xpath = "//div[text()='Family Home']")
	private WebElement ownershiptype;
	@FindBy(id = "primaryApplicant.addresses_monthlyPayment_formly_8_dl4Number_monthlyPayment_primaryApplicant.addresses-0")
	private WebElement monthlyAmount;
	@FindBy(xpath = "(//button[@class='btn btn-info btn-sm'])[2]")
	private WebElement addEmployment;
	@FindBy(id = "primaryApplicant.employments_xIncomeType_xIncomeTypeprimaryApplicant.employments-0")
	private WebElement employment;
	@FindBy(xpath = "//div[text()='Employment']")
	private WebElement employmenttype;
	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[9]")
	private WebElement income;
	@FindBy(xpath = "//div[text()='Primary']")
	private WebElement incometype;
	@FindBy(id = "primaryApplicant.employments_title_titleprimaryApplicant.employments-0")
	private WebElement occupation;
	@FindBy(id = "primaryApplicant.employments_xIncomeSourceName_xIncomeSourceNameprimaryApplicant.employments-0")
	private WebElement incomesrc;
	@FindBy(id = "primaryApplicant.employments_xEmployerSupervisor_xEmployerSupervisorprimaryApplicant.employments-0")
	private WebElement supervisor;
	@FindBy(id = "primaryApplicant.employments_phone_phoneprimaryApplicant.employments-0")
	private WebElement employerPhone;
	@FindBy(id = "primaryApplicant.employments_street1_street1primaryApplicant.employments-0")
	private WebElement employmentAddress;
	@FindBy(id = "primaryApplicant.employments_postalCode_postalCodeprimaryApplicant.employments-0")
	private WebElement employerZipCode;
	@FindBy(id = "primaryApplicant.employments_city_cityprimaryApplicant.employments-0")
	private WebElement employerCity;

	@FindBy(id = "primaryApplicant.employments_yearsEmployed_formly_8_dl4Number_yearsEmployed_primaryApplicant.employments-0")
	private WebElement Years;
	@FindBy(id = "primaryApplicant.employments_monthsEmployed_formly_8_dl4Number_monthsEmployed_primaryApplicant.employments-0")
	private WebElement Months;
	@FindBy(id = "primaryApplicant.employments_xPayDays_xPayDaysprimaryApplicant.employments-0")
	private WebElement paydayfrequency;

	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[11]")
	private WebElement hoursincome;
	@FindBy(xpath = "//div[text()='Full Time']")
	private WebElement hours;
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[24]")
	private WebElement salary;
	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[12]")
	private WebElement payday;
	@FindBy(xpath = "//div[text()='Monthly']")
	private WebElement week;
	@FindBy(id = "primaryApplicant.employments_xPaydayGrossIncome_formly_2_dl4Number_xPaydayGrossIncome_primaryApplicant.employments-0")
	private WebElement Paydaygross;
	@FindBy(id = "primaryApplicant.employments_xPaydayNetIncome_formly_2_dl4Number_xPaydayNetIncome_primaryApplicant.employments-0")
	private WebElement Paydaynet;
	@FindBy(xpath = "(//button[@class='btn btn-info btn-sm'])[3]")
	private WebElement addReference;
	@FindBy(id = "primaryApplicant.references_refName_refNameprimaryApplicant.references-0")
	private WebElement addReferenceName;
	@FindBy(id = "primaryApplicant.references_mobilePhone_mobilePhoneprimaryApplicant.references-0")
	private WebElement addReferencePhone;
	@FindBy(id = "primaryApplicant.references_xrelationshipFF_xrelationshipFFprimaryApplicant.references-0")
	private WebElement relationship;
	@FindBy(id = "primaryApplicant.references_street1_street1primaryApplicant.references-0")
	private WebElement streetAddress;
	@FindBy(id = "primaryApplicant.references_postalCode_postalCodeprimaryApplicant.references-0")
	private WebElement referenceZipcode;
	@FindBy(xpath = "(//button[@class='btn btn-info btn-sm'])[3]")
	private WebElement addReferenceOne;
	@FindBy(id = "primaryApplicant.references_refName_refNameprimaryApplicant.references-1_1")
	private WebElement addReferenceNameOne;
	@FindBy(id = "primaryApplicant.references_mobilePhone_mobilePhoneprimaryApplicant.references-1_1")
	private WebElement addReferencePhoneOne;
	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[16]")
	private WebElement requestterms;
	@FindBy(xpath = "//div[text()='9']")
	private WebElement terms;
	@FindBy(xpath = "//div[text()='12']")
	private WebElement termsOne;
	@FindBy(xpath = "//div[text()='15']")
	private WebElement termsTwo;
	@FindBy(xpath = "//div[text()='18']")
	private WebElement termsThree;
	@FindBy(xpath = "//div[text()='24']")
	private WebElement termsFour;
	@FindBy(xpath = "//div[text()='30']")
	private WebElement termsFive;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
	private WebElement submit;

	public WebElement getNewApplication() {
		return newApplication;
	}

	public WebElement getBranch() {
		return branch;
	}

	public WebElement getBranchname() {
		return branchname;
	}

	public WebElement getsSN() {
		return sSN;
	}

	public WebElement getInteraction() {
		return interaction;
	}

	public WebElement getInteractionType() {
		return interactionType;
	}

	public WebElement getInitialAmount() {
		return initialAmount;
	}

	public WebElement getReferralName() {
		return referralName;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSuffix() {
		return suffix;
	}

	public WebElement getSuffixtype() {
		return suffixtype;
	}

	public WebElement getDateofBirth() {
		return dateofBirth;
	}

	public WebElement getPreferredName() {
		return preferredName;
	}

	public WebElement getNumberofDependents() {
		return numberofDependents;
	}

	public WebElement getAgesofDependents() {
		return agesofDependents;
	}

	public WebElement getHomePhone() {
		return homePhone;
	}

	public WebElement getMobilePhone() {
		return mobilePhone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getAddressLine() {
		return addressLine;
	}

	public WebElement getAddressLine2() {
		return addressLine2;
	}

	public WebElement getAddEmployment() {
		return addEmployment;
	}

	public WebElement getEmployment() {
		return employment;
	}

	public WebElement getEmploymentType() {
		return employmenttype;
	}

	public WebElement getIncome() {
		return income;
	}

	public WebElement getIncomeType() {
		return incometype;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getIncomesrc() {
		return incomesrc;
	}

	public WebElement getSupervisor() {
		return supervisor;
	}

	public WebElement getEmploymentPhone() {
		return employerPhone;
	}

	public WebElement getEmploymentAddress() {
		return employmentAddress;
	}

	public WebElement getEmployerZipCode() {
		return employerZipCode;
	}

	public WebElement getEmployerCity() {
		return employerCity;
	}

	public WebElement getAddReference() {
		return addReference;
	}

	public WebElement getAddReferenceName() {
		return addReferenceName;
	}

	public WebElement getAddReferencePhone() {
		return addReferencePhone;
	}

	public WebElement getRelationship() {
		return relationship;
	}

	public WebElement getStreetAddress() {
		return streetAddress;
	}

	public WebElement getReferenceZipcode() {
		return referenceZipcode;
	}

	public WebElement getAddReferenceOne() {
		return addReferenceOne;
	}

	public WebElement getAddReferenceNameOne() {
		return addReferenceNameOne;
	}

	public WebElement getAddReferencePhoneOne() {
		return addReferencePhoneOne;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void newApplicant(Hashtable<String, String> data) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor script = (JavascriptExecutor) DriverManager.getDriver();
		script.executeScript("arguments[0].click()", newApplication);
	}

	public void addApplicantDetails(Hashtable<String, String> data) throws InterruptedException, IOException {

		Thread.sleep(3000);
		JavascriptExecutor script = (JavascriptExecutor) DriverManager.getDriver();
		script.executeScript("arguments[0].click()", loantype);

		JavascriptExecutor scriptOne = (JavascriptExecutor) DriverManager.getDriver();
		scriptOne.executeScript("arguments[0].click()", select);

		Thread.sleep(15000);
		click(branch);
		click(branchname);
		Thread.sleep(5000);
		String ssn = data.get("ssn");
		sendkeys(sSN, ssn);
		click(customerlookup);
		Thread.sleep(1000);
		click(interaction);
		Thread.sleep(1000);
		click(interactionType);

	}

	public void amountInitial(Hashtable<String, String> data) throws IOException, InterruptedException {
		Thread.sleep(1000);
		String initialamount = data.get("");
		sendkeys(initialAmount, initialamount);
	}

	public void details(Hashtable<String, String> data) throws InterruptedException, IOException {

		click(reasonforloan);
		click(loanreason);
		Thread.sleep(5000);
		click(authorize);
		click(referral);
		Thread.sleep(1000);
		click(referralName);
		String referralname = data.get("referralname");
		Thread.sleep(1000);
		sendkeys(referralName, referralname);
		Thread.sleep(1000);
		String firstname = data.get("firstname");
		sendkeys(firstName, firstname);
		Thread.sleep(1000);
		String lastname = data.get("lastname");
		sendkeys(lastName, lastname);
		String dateofbirth = data.get("dateofbirth");
		sendkeys(dateofBirth, dateofbirth);
		String homephone = data.get("homephone");
		sendkeys(homePhone, homephone);
		Thread.sleep(1000);
		String mobilephone = data.get("mobilephone");
		sendkeys(mobilePhone, mobilephone);
		Thread.sleep(1000);
		String Email = data.get("Email");
		sendkeys(email, Email);
		click(employee);

	}

	public void primaryAddressDetails(Hashtable<String, String> data) throws InterruptedException, IOException {
		Thread.sleep(4000);
		click(addAddress);
		Thread.sleep(1000);
		String addressline = data.get("AddressLine1");
		sendkeys(addressLine, addressline);
		// sendKeys(addressLine2,addressline2);
		String ZipCode = data.get("ZipCode1");
		sendkeys(zipcode, ZipCode);
		Thread.sleep(1000);
		String yearsatresidence = data.get("YearsAtResidense1");
		sendkeys(YearsAtResidence, yearsatresidence);
		Thread.sleep(1000);
		String monthsatresidence = data.get("MonthsAtResidence1");
		sendkeys(MonthsAtResidence, monthsatresidence);
		Thread.sleep(1000);
		click(ownership);
		Thread.sleep(1000);
		click(ownershiptype);
		Thread.sleep(1000);
		click(monthlyAmount);
		Thread.sleep(1000);
		String monthlyamount = data.get("MonthlyAmount");
		sendkeys(monthlyAmount, monthlyamount);
	}

	public void employementType(Hashtable<String, String> data) throws InterruptedException, IOException {
		Thread.sleep(3000);

		click(addEmployment);
		Thread.sleep(1000);
		click(employment);
		Thread.sleep(1000);
		click(employmenttype);
		Thread.sleep(1000);
		click(income);
		Thread.sleep(1000);
		click(incometype);
		String Profession = data.get("Occupation/Profession1");
		sendkeys(occupation, Profession);
		String incomesource = data.get("EmployerName1");
		sendkeys(incomesrc, incomesource);
		String supervisorname = data.get("Supervisor/Department1  ");
		sendkeys(supervisor, supervisorname);
		String employmentphone = data.get("EmployerPhone1");
		sendkeys(employerPhone, employmentphone);
		String EmployerAddress = data.get("EmployerAddressLine1_1");
		sendkeys(employmentAddress, EmployerAddress);
		String employmentzipcode = data.get("EmployerZipCode1");
		sendkeys(employerZipCode, employmentzipcode);
		String employercity = data.get("EmployerCity1");
		sendkeys(employerCity, employercity);

		Thread.sleep(1000);
		String years = data.get("Years1");
		sendkeys(Years, years);
		String months = data.get("Months1");
		sendkeys(Months, months);
		Thread.sleep(1000);
		String PaydayFrequency = data.get("PayFrequency1");
		sendkeys(paydayfrequency, PaydayFrequency);
		Thread.sleep(1000);
		click(hoursincome);
		Thread.sleep(3000);
		click(hours);
		Thread.sleep(2000);
		click(salary);
		click(payday);
		click(week);
		String paydaygrossincome = data.get("MonthlyGrossIncome1");
		sendkeys(Paydaygross, paydaygrossincome);
		String paydaynetincome = data.get("MonthlyNetIncome1");
		sendkeys(Paydaynet, paydaynetincome);

	}

	public void reference(Hashtable<String, String> data) throws InterruptedException, IOException {
		Thread.sleep(3000);

		click(addReference);
		String referencename = data.get("referencename");
		sendkeys(addReferenceName, referencename);
		String referencephone = data.get("referencephone");
		sendkeys(addReferencePhone, referencephone);

		Thread.sleep(3000);
		click(addReferenceOne);
		String addreferencenameone = data.get("addreferencenameone");
		sendkeys(addReferenceNameOne, addreferencenameone);
		String addreferencephoneone = data.get("addreferencephoneone");
		sendkeys(addReferencePhoneOne, addreferencephoneone);
	}

	public void firstTerm(Hashtable<String, String> data) {

		click(requestterms);
		click(terms);
	}

	public void secondTerm() {

		click(requestterms);
		click(termsOne);
	}

	public void thirdTerm() {

		click(requestterms);
		click(termsTwo);
	}

	public void fourthTerm() {

		click(requestterms);
		click(termsThree);
	}

	public void fifthTerm() {

		click(requestterms);
		click(termsFour);
	}

	public void sixthTerm() {

		click(requestterms);
		click(termsFive);
	}

	public void submit(Hashtable<String, String> data) throws InterruptedException {
		Thread.sleep(1000);
		click(submit);

	}

}
