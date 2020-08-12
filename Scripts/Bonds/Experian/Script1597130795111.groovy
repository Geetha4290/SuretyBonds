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
WebUI.setText(findTestObject('UI Test Objects/Pages/Login Page/textUsername'), GlobalVariable.UN)

'Passing password globally'
WebUI.setText(findTestObject('UI Test Objects/Pages/Login Page/textPassword'), GlobalVariable.PW)

'Click on agree button'
WebUI.click(findTestObject('UI Test Objects/Pages/Login Page/btnAgree'))

WebUI.delay(5)

'Verifying text on home'
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Home Page/labelWelcome'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkCommercialbonds'))

WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkBonds'))

WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkBuyABond'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAccount/labelBuyABond'), 'Buy a Bond: Choose an Account')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAccount/btnContinue'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAgency/listChooseAgency'), 'Agency Code', 
    false)

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAgency/textAgency'), '*')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAgency/btnSubmit'))

WebUI.delay(5)

//WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/labelChooseABond'), 'Buy a Bond: Choose Bond Type')
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/listState'), 'California', 
    false)

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/listBondClass'), '*Test Bond Class', 
    false)

WebUI.delay(3)

DDvalue = WebUI.verifyOptionSelectedByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/listBondCategory'), 
    '*IT Testing (CH)', false, 0)

println(DDvalue)

WebUI.delay(2)

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/btnContinue'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PremiumCalculation/labelPremiumCalculation'), 
    'Buy a Bond: Premium Calculation')

WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PremiumCalculation/listAttorneyInFact'), 
    'SAMPLEAGENT, MARCUS (*** TEST AGENCY ***)', false)

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PremiumCalculation/btnContinue'))

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/labelPrincipalIndividual Owner'), 
    'Buy a Bond: Principal / Individual Owner')

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textOwnerName'), 'Nancy L Birkhead')

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textHomeAddress'), '378 East St')

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textCity'), 'Bloomsburg')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/listState'), 
    'Pennsylvania', false)

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textZipCode'), '17815')

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textSocialSecurityNumber'), 
    '666-70-1451')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/radioBankruptcy'))

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/radioIndmenifySurety'))

//WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/listSpouseIndmenifySurety'), 'Yes', false)
//WebUI.verifyElementChecked(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/listIsThereAnotherPrincipalIndividualOwnerToEnter'), 2)
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/btnContinue'))

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/labelCompanyBusinessEntity'), 
    'Buy a Bond: Company / Business Entity')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/linkUseSameAddressAsPrincipalIndividualOwner'))

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/textCompleteCompanyName'), 'GAIG')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/btnContinue'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ReviewScreen/labelReviewScreen'), 'Buy a Bond: Review Screen')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ReviewScreen/listApplicantName'), 'Nancy L Birkhead', 
    false)

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ReviewScreen/btnSubmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Decision/labelDecision'), 'Buy a Bond: Decision')

//trackingnumber = WebUI.getText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Decision/labelTrackingNumber'))
//println(trackingnumber)
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Decision/btnSaveQuote'))

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Quotation/labelQuotation'), 'Buy a Bond: Quotation')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Quotation/btnGoToBond'))

def creditscore = CustomKeywords.'bonds.MySurety.GenericGetDataBasedOnId'('vwCreditScore')

println(creditscore)

//int Creditscore = Integer.parseInt(creditscore)
//println(Creditscore)
//to verify whether credit score is greater than -4
WebUI.verifyNotEqual(creditscore, '-4')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

