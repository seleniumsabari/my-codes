package org.selenium.day9.dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuesSix {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
		WebElement aadhaar = dr.findElement(By.id("aadhdarNo"));
		aadhaar.sendKeys("812425252525");
		WebElement aname = dr.findElement(By.id("aadhdarName"));
		aname.sendKeys("Sabari");
		WebElement cname = dr.findElement(By.id("candidateName"));
		cname.sendKeys("Sabari");
		WebElement gen = dr.findElement(By.id("gender"));
		gen.click();
		WebElement dob = dr.findElement(By.id("dob"));
		dob.sendKeys("25/03/1992");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement dis = dr.findElement(By.id("nativeDistrict"));
		Select dd=new Select(dis);
		dd.selectByIndex(2);
		WebElement mandal = dr.findElement(By.id("nativeMandal"));
		Select dd1 =new Select(mandal);
		dd1.selectByIndex(5);
		WebElement vil = dr.findElement(By.id("nativeVillage"));
		vil.sendKeys("Bangarpet");
		WebElement comm = dr.findElement(By.id("community"));
		Select dd2=new Select(comm);
		dd2.selectByIndex(1);
		WebElement fname = dr.findElement(By.id("fatherName"));
		fname.sendKeys("Balamurugan");
		WebElement mname = dr.findElement(By.id("motherName"));
		mname.sendKeys("Indira Gandhi");
		WebElement lang = dr.findElement(By.id("motherTongue"));
		Select dd3=new Select(lang);
		dd3.selectByIndex(6);
		WebElement rel = dr.findElement(By.id("religion"));
		Select dd4=new Select(rel);
		dd4.selectByIndex(1);
		WebElement idmark = dr.findElement(By.id("identificationMark1"));
		idmark.sendKeys("Mole on left hand");
		WebElement idmark2 = dr.findElement(By.id("identificationMark2"));
		idmark2.sendKeys("Mole on right hand");
		WebElement able = dr.findElement(By.xpath("(//input[@id='isPh'])[2]"));
		able.click();
		WebElement ex = dr.findElement(By.xpath("(//input[@id='isEx'])[2]"));
		ex.click();
		WebElement cen = dr.findElement(By.xpath("(//input[@id='isCensus'])[2]"));
		cen.click();
		WebElement ncc = dr.findElement(By.xpath("(//input[@id='isNcc'])[2]"));
		ncc.click();
		WebElement emp = dr.findElement(By.xpath("(//input[@id='isGovt'])[2]"));
		emp.click();
		WebElement claim = dr.findElement(By.xpath("(//input[@id='isClaim'])[2]"));
		claim.click();
		WebElement age = dr.findElement(By.xpath("(//input[@id='isAgeClaim'])[2]"));
		age.click();
		WebElement add = dr.findElement(By.id("commAddress1"));
		add.sendKeys("Sakthi Apartments");
		WebElement add1 = dr.findElement(By.id("commAddress2"));
		add1.sendKeys("Amarpet");
		WebElement per = dr.findElement(By.id("perAddress1"));
		per.sendKeys("Saligramam");
		WebElement com = dr.findElement(By.id("commAddress3"));
		com.sendKeys("Bangarpet");
		WebElement per2 = dr.findElement(By.id("perAddress2"));
		per2.sendKeys("SNKL");
		WebElement state = dr.findElement(By.id("commState"));
		state.sendKeys("Tamilnadu");
		WebElement per3 = dr.findElement(By.id("perAddress3"));
		per3.sendKeys("Chennai");
		WebElement pin = dr.findElement(By.id("commPincode"));
		pin.sendKeys("600093");
		WebElement per4 = dr.findElement(By.id("perState"));
		per4.sendKeys("Telungana");
		WebElement per5 = dr.findElement(By.id("perPincode"));
		per5.sendKeys("600092");
		WebElement mail = dr.findElement(By.id("emailId"));
		mail.sendKeys("sabari@gmail.com");
		WebElement mobile = dr.findElement(By.id("mobileNo"));
		mobile.sendKeys("9531285625");
		WebElement reg = dr.findElement(By.id("typeOfStudy"));
		reg.click();
		WebElement class1 = dr.findElement(By.id("firstClassDistrict"));
		Select dd5=new Select(class1);
		dd5.selectByIndex(2);
		WebElement sch = dr.findElement(By.id("firstClassSchool"));
		sch.sendKeys("MHSS");
		WebElement class2 = dr.findElement(By.id("secondClassDistrict"));
		Select dd6=new Select(class2);
		dd6.selectByIndex(2);
		WebElement sch2 = dr.findElement(By.id("secondClassSchool"));
		sch2.sendKeys("MHSS");
		WebElement class3 = dr.findElement(By.id("thirdClassDistrict"));
		Select dd7=new Select(class3);
		dd7.selectByVisibleText("Hyderabad");
		WebElement sch3 = dr.findElement(By.id("thirdClassSchool"));
		sch3.sendKeys("MHSS");
		WebElement class4 = dr.findElement(By.id("fourthClassDistrict"));
		Select dd8=new Select(class4);
		dd8.selectByIndex(2);
		WebElement sch4 = dr.findElement(By.id("fourthClassSchool"));
		sch4.sendKeys("MHSS");
		WebElement class5 = dr.findElement(By.id("fifthClassDistrict"));
		Select dd9=new Select(class5);
		dd9.selectByIndex(2);
		WebElement sch5 = dr.findElement(By.id("fifthClassSchool"));
		sch5.sendKeys("MHSS");
		WebElement class6 = dr.findElement(By.id("sixthClassDistrict"));
		Select dd10=new Select(class6);
		dd10.selectByIndex(2);
		WebElement sch6 = dr.findElement(By.id("sixthClassSchool"));
		sch6.sendKeys("MHSS");
		WebElement class7 = dr.findElement(By.id("seventhClassDistrict"));
		Select dd11=new Select(class7);
		dd11.selectByIndex(2);
		WebElement sch7 = dr.findElement(By.id("seventhClassSchool"));
		sch7.sendKeys("MHSS");
		WebElement class8 = dr.findElement(By.id("eighthClassDistrict"));
		Select dd12=new Select(class8);
		dd12.selectByIndex(2);
		WebElement sch8 = dr.findElement(By.id("eighthClassSchool"));
		sch8.sendKeys("MHSS");
		WebElement class9 = dr.findElement(By.id("ninthClassDistrict"));
		Select dd13=new Select(class9);
		dd13.selectByIndex(2);
		WebElement sch9 = dr.findElement(By.id("ninthClassSchool"));
		sch9.sendKeys("MHSS");
		WebElement class10 = dr.findElement(By.id("ssc"));
		Select dd14=new Select(class10);
		dd14.selectByIndex(2);
		WebElement sch10 = dr.findElement(By.id("sscBoard"));
		sch10.sendKeys("SSLC");
		WebElement hall = dr.findElement(By.id("sscHT_no"));
		hall.sendKeys("28401732");
		WebElement date = dr.findElement(By.id("sscDOP_MON"));
		Select dd15=new Select(date);
		dd15.selectByIndex(2);
		WebElement year = dr.findElement(By.id("sscDOP_YEAR"));
		Select dd16=new Select(year);
		dd16.selectByValue("2007");
		WebElement percentage = dr.findElement(By.id("ssc_grade"));
		percentage.sendKeys("99%");
		Alert aa=dr.switchTo().alert();
		aa.accept();
		WebElement dis1 = dr.findElement(By.id("localDistrict"));
		Select dd17=new Select(dis1);
		dd17.selectByIndex(2);
		WebElement xdis = dr.findElement(By.id("localDistrict"));
		Select dd18=new Select(xdis);
		dd18.selectByIndex(2);
		WebElement zone	= dr.findElement(By.id("zoneBelongs"));
		Select dd19=new Select(zone);
		dd19.selectByIndex(3);
		WebElement dis2 = dr.findElement(By.id("intermediate"));
		Select dd20=new Select(dis2);
		dd20.selectByIndex(2);
		WebElement board = dr.findElement(By.id("intermediateBoard"));
		board.sendKeys("HSC");
		WebElement group = dr.findElement(By.id("intermediateGroup"));
		Select dd21=new Select(group);
		dd21.selectByIndex(5);
		WebElement pdate = dr.findElement(By.id("intermediateDOP_MON"));
		Select dd22=new Select(pdate);
		dd22.selectByIndex(3);
		WebElement pyear = dr.findElement(By.id("intermediateDOP_YEAR"));
		Select dd23=new Select(pyear);
		dd23.selectByVisibleText("2007");
		WebElement halltkt = dr.findElement(By.id("intermediateHT_no"));
		halltkt.sendKeys("28401732");
		WebElement clg = dr.findElement(By.id("intermediate_clg"));
		clg.sendKeys("CEG");
		WebElement perc = dr.findElement(By.id("intermediate_grade"));
		perc.sendKeys("100");
		WebElement dip = dr.findElement(By.id("diploma"));
		Select dd24=new Select(dip);
		dd24.selectByIndex(2);
		WebElement dboard = dr.findElement(By.id("diplomaBoard"));
		dboard.sendKeys("DOTE");
		WebElement dbrch = dr.findElement(By.id("diplomaGroup"));
		Select dd25=new Select(dbrch);
		dd25.selectByIndex(4);
		WebElement ddate = dr.findElement(By.id("diplomaDOP_MON"));
		Select dd26=new Select(ddate);
		dd26.selectByIndex(3);
		WebElement dyear = dr.findElement(By.id("diplomaDOP_YEAR"));
		Select dd27=new Select(dyear);
		dd27.selectByVisibleText("2010");
		WebElement hallno = dr.findElement(By.id("diploma_no"));
		hallno.sendKeys("28401732");
		WebElement dclg = dr.findElement(By.id("diploma_clg"));
		dclg.sendKeys("MKPTC");
		WebElement dper = dr.findElement(By.id("diploma_grade"));
		dper.sendKeys("100");
		WebElement ugd = dr.findElement(By.id("degree"));
		Select dd28=new Select(ugd);
		dd28.selectByIndex(5);
		WebElement duniv = dr.findElement(By.id("degreeUniversity"));
		Select dd29=new Select(duniv);
		dd29.selectByIndex(5);
		WebElement dgroup = dr.findElement(By.id("degreeGroup"));
		Select dd30=new Select(dgroup);
		dd30.selectByIndex(15);
		WebElement dedate = dr.findElement(By.id("degreeDOP_MON"));
		Select dd31=new Select(dedate);
		dd31.selectByIndex(4);
		WebElement deyear = dr.findElement(By.id("degreeDOP_YEAR"));
		Select dd32=new Select(deyear);
		dd32.selectByVisibleText("2013");
		WebElement hallnode = dr.findElement(By.id("degree_no"));
		hallnode.sendKeys("2014152020");
		WebElement declg = dr.findElement(By.id("degree_clg"));
		declg.sendKeys("CEG");
		WebElement deper = dr.findElement(By.id("degree_grade"));
		deper.sendKeys("100");
		WebElement pg = dr.findElement(By.id("postgraduatedegree"));
		Select dd33=new Select(pg);
		dd33.selectByIndex(2);
		WebElement pguniv = dr.findElement(By.id("postgraduatedegreeUniversity"));
		Select dd34=new Select(pguniv);
		dd34.selectByIndex(10);
		WebElement pgbrch = dr.findElement(By.id("postgraduatedegreeGroup"));
		Select dd35=new Select(pgbrch);
		dd35.selectByIndex(25);
		WebElement pgdate = dr.findElement(By.id("postgraduatedegreeDOP_MON"));
		Select dd36=new Select(pgdate);
		dd36.selectByIndex(4);
		WebElement pgyear = dr.findElement(By.id("postgraduatedegreeDOP_YEAR"));
		Select dd37=new Select(pgyear);
		dd37.selectByVisibleText("2015");
		WebElement pghno = dr.findElement(By.id("postgraduatedegree_no"));
		pghno.sendKeys("2013152020");
		WebElement pgclg = dr.findElement(By.id("postgraduatedegree_clg"));
		pgclg.sendKeys("CEG");
		WebElement pgsp = dr.findElement(By.id("postgraduatedegree_spec"));
		pgsp.sendKeys("Software Testing");
		WebElement pgper = dr.findElement(By.id("postgraduatedegree_grade"));
		pgper.sendKeys("100");
		WebElement mphil = dr.findElement(By.id("mphil"));
		Select dd38=new Select(mphil);
		dd38.selectByIndex(4);
		WebElement mclg = dr.findElement(By.id("mphil_clg"));
		mclg.sendKeys("IIT MADRAS");
		WebElement muniv = dr.findElement(By.id("mphilUniversity"));
		Select dd39=new Select(muniv);
		dd39.selectByIndex(5);
		WebElement mdate = dr.findElement(By.id("mphilDOP_MON"));
		Select dd40=new Select(mdate);
		dd40.selectByIndex(4);
		WebElement myear = dr.findElement(By.id("mphilDOP_YEAR"));
		Select dd41=new Select(myear);
		dd41.selectByVisibleText("2017");
		WebElement msp = dr.findElement(By.id("mphil_speci"));
		msp.sendKeys("Software");
		WebElement mhno = dr.findElement(By.id("mphilHt_no"));
		mhno.sendKeys("2015152020");
		WebElement drdis = dr.findElement(By.id("phdUniversity"));
		Select dd42=new Select(drdis);
		dd42.selectByIndex(5);
		WebElement drs = dr.findElement(By.id("phdGroup"));
		drs.sendKeys("Computer Science");
		WebElement drt = dr.findElement(By.id("phd_topic"));
		drt.sendKeys("Software Management");
		WebElement drdate = dr.findElement(By.id("phdDOP_MON"));
		Select dd43=new Select(drdate);
		dd43.selectByIndex(4);
		WebElement dryear = dr.findElement(By.id("phdDOP_YEAR"));
		Select dd44=new Select(dryear);
		dd44.selectByVisibleText("2018");
		WebElement declare = dr.findElement(By.id("declaration"));
		declare.click();
		WebElement preview = dr.findElement(By.xpath("//button[@onclick='previewApplForm()']"));
		preview.click();		
}
}
