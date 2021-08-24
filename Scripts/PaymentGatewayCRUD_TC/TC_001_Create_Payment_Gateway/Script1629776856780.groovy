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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper

AddResponse = WS.sendRequest(findTestObject('PaymentGatewayCRUD/AddPaymentGateway', [('PaymentGatewayProId') : 1, ('PaymentGatewayName') : PaymentGName
            , ('ProfileID') : '19ACF053-363F-41B2-80C6-B95012AA3A31', ('AccessKey') : '7fddb35cc1ee3cf1964e1e419844bc9f'
            , ('SecretKey') : 'bc11a1bef8b0408690fa4667e4caca788ddd5631067a4c48afd2ce059b095ee96aa343a7669b45e0b6c1302664f8f23f1cfa5e4d1991473598838e6503515ea4422ba57996974d6795cf2a8f0a542de31199e3acd21440cfb80559005520cd5acfa31163260746e6882ed496a2d91228aae98fe6c9054e7f82211608bdc6a05a'
            , ('OnboardURL') : 'https://testsecureacceptance.cybersource.com/pay ', ('OnboardFinishURL') : 'https://risingstar.strateqgroup.com/PaymentProfile/Finish?Gateway=1&locale={0}'
            , ('OnboardCancelledURL') : 'NULL', ('OnboardErrorURL') : 'NULL', ('APIEndpoint') : 'abc', ('OnboardTimeout') : 250
            , ('MaximumCardAllowed') : 4, ('MasterMerchantID') : 'gpsgh065004547701', ('MMKeyFile') : 'C:/fakepath/gpsgh065004547701.p12'
            , ('DefaultCountry') : 195, ('DefaultCurrency') : 92, ('isAvailable') : true, ('Logo') : 'Logo', ('ClientID') : ' asdsa'
            , ('OnboardingMethod') : 'POST', ('ExcludeLoyalty') : false, ('PreAuthAmount') : 0, ('ConfigurationKey') : 'NULL'
            , ('AcquirerID') : 'APP1', ('CardPrefix') : 'NULL']))

WS.verifyResponseStatusCode(AddResponse, 200)

println(AddResponse.getResponseText())

def jsonS = new JsonSlurper()

def jsonResponse = jsonS.parseText(AddResponse.getResponseText())

ID = jsonResponse.id

WS.verifyElementPropertyValue(AddResponse, 'Name', PaymentGName)

GetResponse = WS.sendRequest(findTestObject('PaymentGatewayCRUD/GetSpecificPaymentGateway', [('SpecificID') : ID]))

WS.verifyResponseStatusCode(GetResponse, 200)

