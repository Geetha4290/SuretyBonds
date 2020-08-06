import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('')

'Passing URL globally'
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Passing username globally'
WebUI.setText(findTestObject('Login Page/Username'), GlobalVariable.UN)

'Passing password globally'
WebUI.setText(findTestObject('Login Page/Password'), GlobalVariable.PW)

'Click on agree button'
WebUI.click(findTestObject('Login Page/Agree Btn'))

'Verifying text on home'
WebUI.verifyElementText(findTestObject('HomePage/Welcome_Text'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('LeftMenu/Commercial bonds left menu'))

WebUI.click(findTestObject('LeftMenu/Bonds'))

WebUI.click(findTestObject('LeftMenu/BuyABond'))

WebUI.verifyElementText(findTestObject('BuyABond/ChooseAccount/BuyABond Text Validation'), 'Buy a Bond: Choose an Account')

WebUI.click(findTestObject('BuyABond/ChooseAccount/ChooseAnAcc_Continue Btn'))

WebUI.selectOptionByLabel(findTestObject('BuyABond/ChooseAgency/ChooseAgencyDD'), 'Agency Code', false)

WebUI.setText(findTestObject('BuyABond/ChooseAgency/AgencyTxtbox'), '*')

WebUI.click(findTestObject('BuyABond/ChooseAgency/SubmitBtn'))

//WebUI.verifyElementText(findTestObject('BuyABond/ChooseABondType/ChooseABondTxtValidtn'), 'Buy a Bond: Choose Bond Type')
WebUI.selectOptionByLabel(findTestObject('BuyABond/ChooseABondType/StateDD'), 'California', false)

WebUI.selectOptionByLabel(findTestObject('BuyABond/ChooseABondType/BondClassDD'), '*Test Bond Class', false)

DDvalue = WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/BuyABond/ChooseABondType/BondCategoryDD'), 
    '*IT Testing (CH)', false, 0)

println(DDvalue)

WebUI.click(findTestObject('BuyABond/ChooseABondType/Continue'))

WebUI.verifyElementText(findTestObject('BuyABond/PremiumCalculation/PremiumCalculationTxtValidtn'), 'Buy a Bond: Premium Calculation')

WebUI.selectOptionByLabel(findTestObject('BuyABond/PremiumCalculation/AttorneyInFactDD'), 'SAMPLEAGENT, MARCUS (*** TEST AGENCY ***)', 
    false)

WebUI.click(findTestObject('BuyABond/PremiumCalculation/ContinueBtn'))

WebUI.verifyElementText(findTestObject('BuyABond/PrincipalIndividual Owner/PrincipalIndividual OwnerTxtValidation'), 'Buy a Bond: Principal / Individual Owner')

WebUI.setText(findTestObject('BuyABond/PrincipalIndividual Owner/OwnerName'), 'Nancy L Birkhead')

WebUI.setText(findTestObject('BuyABond/PrincipalIndividual Owner/Homeaddress'), '378 East St')

WebUI.setText(findTestObject('BuyABond/PrincipalIndividual Owner/City'), 'Bloomsburg')

WebUI.selectOptionByLabel(findTestObject('BuyABond/PrincipalIndividual Owner/StateDD'), 'Pennsylvania', false)

WebUI.setText(findTestObject('BuyABond/PrincipalIndividual Owner/ZipCode'), '17815')

WebUI.setText(findTestObject('BuyABond/PrincipalIndividual Owner/SocialSecurityNumber'), '666-70-1451')

WebUI.click(findTestObject('BuyABond/PrincipalIndividual Owner/BankruptcyRadioBtn'))

WebUI.click(findTestObject('BuyABond/PrincipalIndividual Owner/IndmenifySuretyRadioBtn'))

//WebUI.selectOptionByLabel(findTestObject('BuyABond/PrincipalIndividual Owner/SpouseIndmenifySuretyDD'), 'Yes', false)
//WebUI.verifyElementChecked(findTestObject('BuyABond/PrincipalIndividual Owner/IsThereAnotherPrincipalIndividualOwnerToEnterDD'), 2)
WebUI.click(findTestObject('BuyABond/PrincipalIndividual Owner/ContinueBtn'))

WebUI.verifyElementText(findTestObject('BuyABond/CompanyBusinessEntity/CompanyBusinessEntityTxtValidtn'), 'Buy a Bond: Company / Business Entity')

WebUI.click(findTestObject('BuyABond/CompanyBusinessEntity/UseSameAddressAsPrincipalIndividualOwnerLink'))

WebUI.setText(findTestObject('BuyABond/CompanyBusinessEntity/CompleteCompanyName'), 'GAIG')

WebUI.click(findTestObject('BuyABond/CompanyBusinessEntity/ContinueBtn'))

WebUI.verifyElementText(findTestObject('BuyABond/ReviewScreen/ReviewScreenTxtValdtn'), 'Buy a Bond: Review Screen')

WebUI.selectOptionByLabel(findTestObject('BuyABond/ReviewScreen/ApplicantNameDD'), 'Nancy L Birkhead', false)

WebUI.click(findTestObject('BuyABond/ReviewScreen/SubmitBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('BuyABond/Decision/DecisionTxtvalidtn'), 'Buy a Bond: Decision')

WebUI.click(findTestObject('BuyABond/Decision/SaveQuoteBtn'))

WebUI.verifyElementText(findTestObject('BuyABond/Quotation/QuotationTxtValidtn'), 'Buy a Bond: Quotation')

WebUI.click(findTestObject('BuyABond/Quotation/GoToBondBtn'))

