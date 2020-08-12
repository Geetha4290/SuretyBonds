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

'Click on commercial bonds'
WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkCommercialbonds'))

'Click on Bonds link'
WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkBonds'))

'Click on By A bond link'
WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkBuyABond'))

WebUI.delay(5)

'Choose Account label validation'
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAccount/labelBuyABond'), 'Buy a Bond: Choose an Account')

'continue button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAccount/btnContinue'))

WebUI.delay(5)

'Select agency code from drop down'
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAgency/listChooseAgency'), 'Agency Code', 
    false)

'Enter * text'
WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAgency/textAgency'), '*')

'Click on submit button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseAgency/btnSubmit'))

WebUI.delay(5)

'Select state from drop down'
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/listState'), 'California', 
    false)

WebUI.delay(2)

'Select bond class from drop down'
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/listBondClass'), '*Test Bond Class', 
    false)

WebUI.delay(3)

'Validating drop value which is selected based on bond class'
DDvalue = WebUI.verifyOptionSelectedByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/listBondCategory'), 
    '*IT Testing (CH)', false, 0)

'printing drop down option'
println(DDvalue)

WebUI.delay(2)

'Click on continue button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ChooseABondType/btnContinue'))

WebUI.delay(5)

'Validating page name'
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PremiumCalculation/labelPremiumCalculation'), 
    'Buy a Bond: Premium Calculation')

'Selecting list attorney from dop down'
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PremiumCalculation/listAttorneyInFact'), 
    'SAMPLEAGENT, MARCUS (*** TEST AGENCY ***)', false)

'Click on continue button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PremiumCalculation/btnContinue'))

WebUI.delay(5)

"Validating Principal / Individual Owner page name"
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/labelPrincipalIndividual Owner'), 
    'Buy a Bond: Principal / Individual Owner')

'Enter owner name'
WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textOwnerName'), 'Nancy L Birkhead')

'Enter home address'
WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textHomeAddress'), '378 East St')

'Enter city'
WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textCity'), 'Bloomsburg')

WebUI.delay(5)

'Enter state'
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/listState'), 
    'Pennsylvania', false)

'Enter zipcode'
WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textZipCode'), '17815')

'Enter social security number'
WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/textSocialSecurityNumber'), 
    '666-70-1451')

'Click on No bankruptcy radio button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/radioBankruptcy'))

'Click Yes indmenify surety radio button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/radioIndmenifySurety'))

'Click on continue button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/PrincipalIndividual Owner/btnContinue'))

'Validating Company / Business Entity page name'
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/labelCompanyBusinessEntity'), 
    'Buy a Bond: Company / Business Entity')

''
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/linkUseSameAddressAsPrincipalIndividualOwner'))

WebUI.setText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/textCompleteCompanyName'), 'GAIG')

WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/CompanyBusinessEntity/btnContinue'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ReviewScreen/labelReviewScreen'), 'Buy a Bond: Review Screen')
'delay'
WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ReviewScreen/listApplicantName'), 'Nancy L Birkhead', 
    false)
'delay'
WebUI.delay(3)

'submit button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/ReviewScreen/btnSubmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Decision/labelDecision'), 'Buy a Bond: Decision')

'Save quote button click'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Decision/btnSaveQuote'))

'delay'
WebUI.delay(5)

'Validating Quotation page name '
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Quotation/labelQuotation'), 'Buy a Bond: Quotation')

'Click on go to bond button'
WebUI.click(findTestObject('UI Test Objects/Pages/Buy A Bond Pages/Quotation/btnGoToBond'))

WebUI.delay(5)

'Getting tracking number based on text tracking number'
def Trackingnumber = CustomKeywords.'bonds.MySurety.BondInfo'('Tracking Number:')

println('Tracking number is:' + Trackingnumber)

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

def Creditscore = CustomKeywords.'bonds.MySurety.GenericGetDataBasedOnId'('vwCreditScore')

println('Credit score is:' + Creditscore)

WebUI.verifyNotEqual(Creditscore, '-4')

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

