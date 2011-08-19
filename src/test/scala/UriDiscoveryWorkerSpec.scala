package main.scala
import edu.cornell.indexbuilder.discovery.VivoUriDiscoveryWorker
 
import org.scalatest.Spec
import org.scalatest.matchers.MustMatchers
import scala.util.parsing.json.JSON._
import edu.cornell.mannlib.vitro.indexbuilder.ParseDataServiceJson

class UriDiscoveryWorkerSpec extends Spec with MustMatchers{

  describe("UriDiscoveryWorker") {

    it("java static method ParseDataServiceJson should be able to parse an initial dataservice result") {      
      val expected = Array(
        "/dataservice?getSolrIndividualsByVClass=1&vclassId=http%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23Thing&page=1", 
        "/dataservice?getSolrIndividualsByVClass=1&vclassId=http%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23Thing&page=2")      
      val result = ParseDataServiceJson.parseInitialIndividualsByVClassForURLs( testCase2, VivoUriDiscoveryWorker.rel13actionName )
      result must be === expected 
    } 

    it("java static method ParseDataServiceJson should be able to parse an initial dataservice result with many pages") {     
      val result = ParseDataServiceJson.parseInitialIndividualsByVClassForURLs( testCase1, VivoUriDiscoveryWorker.rel13actionName )
      result.length must be === (62513 / 30) + 1
    } 

    it("parseIndividualsByVClassForURIs should return URIs from a json request"){
      val result = ParseDataServiceJson.parseIndividualsByVClassForURIs( testCase2 )
      result.length must be === testCase2IndividualUris.length
      result must be === testCase2IndividualUris
    }
  }


 val testCase1= """ {"errorMessage":"",
 "vclass":
    {"name":"Thing", "URI":"http://www.w3.org/2002/07/owl#Thing"},
 "totalCount":62513,
 "pages":[
    {"index":"1",
     "text":"1",
     "param":"page=1"},
    {"index":"2",
     "text":"2",
     "param":"page=2"},
    {"index":"41",
     "text":"more...",
     "param":"page=41"}],
 "letters":[
    {"text":"A",
     "param":"alpha=A"},
    {"text":"Y",
     "param":"alpha=Y"},
    {"text":"Z",
     "param":"alpha=Z"}],
 "individuals":[
    {"lastName":"",
     "profileUrl":"/individual/MissingEnergyattheLHCTheDarkMatterConnection",
     "name":"\t Missing Energy at the LHC: The Dark Matter Connection",
     "preferredTitle":"",
     "vclassName":"Lecture, Seminar, or Colloquium",
     "label":"\t Missing Energy at the LHC: The Dark Matter Connection",
     "firstName":"",
     "moniker":"Lecture, Seminar, or Colloquium",
     "URI":"http://vivo.cornell.edu/individual/MissingEnergyattheLHCTheDarkMatterConnection"},
    {"lastName":"",
     "profileUrl":"/individual/VectorlikeConfinementanditsSignaturesattheLHC",
     "name":"\t Vectorlike Confinement and its Signatures at the LHC ",
     "preferredTitle":"",
     "vclassName":"Lecture, Seminar, or Colloquium",
     "label":"\t Vectorlike Confinement and its Signatures at the LHC ",
     "firstName":"",
     "moniker":"Lecture, Seminar, or Colloquium",
     "URI":"http://vivo.cornell.edu/individual/VectorlikeConfinementanditsSignaturesattheLHC"},
    {"lastName":"",
     "profileUrl":"/individual/n51041",
     "name":"\tAWP Collection of Short Fiction Prize (runner-up)",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tAWP Collection of Short Fiction Prize (runner-up)",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n51041"},
    {"lastName":"",
     "profileUrl":"/individual/n29929",
     "name":"\tCollege Composition and Communication",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tCollege Composition and Communication",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n29929"},
    {"lastName":"",
     "profileUrl":"/individual/n63562",
     "name":"\tDerek Bok Award for Distinction in Teaching",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tDerek Bok Award for Distinction in Teaching",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n63562"},
    {"lastName":"",
     "profileUrl":"/individual/n16639",
     "name":"\tDerek Bok Award for Distinction in Teaching",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tDerek Bok Award for Distinction in Teaching",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n16639"},
    {"lastName":"",
     "profileUrl":"/individual/n53997",
     "name":"\tDerek Bok Award for Distinction in Teaching",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tDerek Bok Award for Distinction in Teaching",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n53997"},
    {"lastName":"",
     "profileUrl":"/individual/DrosophilaintestinalresponsetobacterialinfectionActivationofhostdefenseandstemcellproliferation",
     "name":"\tDrosophila intestinal response to bacterial infection: Activation of host defense and stem cell proliferation",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":"\tDrosophila intestinal response to bacterial infection: Activation of host defense and stem cell proliferation",
     "firstName":"",
     "moniker":"Jugatae Seminar",
     "URI":"http://vivo.cornell.edu/individual/DrosophilaintestinalresponsetobacterialinfectionActivationofhostdefenseandstemcellproliferation"},
    {"lastName":"",
     "profileUrl":"/individual/n31656",
     "name":"\tFulbright-Hays Fellowship at the University of Edinburgh",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tFulbright-Hays Fellowship at the University of Edinburgh",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n31656"},
    {"lastName":"",
     "profileUrl":"/individual/n64870",
     "name":"\tGLQ: A Journal of Lesbian and Gay Studies",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tGLQ: A Journal of Lesbian and Gay Studies",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n64870"},
    {"lastName":"",
     "profileUrl":"/individual/n110138",
     "name":"\tHelene Wurlitzer Foundation Residency",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tHelene Wurlitzer Foundation Residency",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n110138"},
    {"lastName":"",
     "profileUrl":"/individual/n24164",
     "name":"\tHelene Wurlitzer Foundation Residency",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tHelene Wurlitzer Foundation Residency",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n24164"},
    {"lastName":"",
     "profileUrl":"/individual/n34309",
     "name":"\tJohn Hope Franklin Center Research Award, William R. Perkins Library",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tJohn Hope Franklin Center Research Award, William R. Perkins Library",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n34309"},
    {"lastName":"",
     "profileUrl":"/individual/n29295",
     "name":"\tLuigi Einaudi Fellowship, Institute for European Studies",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tLuigi Einaudi Fellowship, Institute for European Studies",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n29295"},
    {"lastName":"",
     "profileUrl":"/individual/n49064",
     "name":"\tMarjorie Harris Weiss Memorial Premium",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tMarjorie Harris Weiss Memorial Premium",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n49064"},
    {"lastName":"",
     "profileUrl":"/individual/n60842",
     "name":"\tMcLean Fellow at the Library Company of Philadelphia",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tMcLean Fellow at the Library Company of Philadelphia",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n60842"},
    {"lastName":"",
     "profileUrl":"/individual/n61466",
     "name":"\tMcMaster Old English Studies and Texts",
     "preferredTitle":"",
     "vclassName":"Series",
     "label":"\tMcMaster Old English Studies and Texts",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n61466"},
    {"lastName":"",
     "profileUrl":"/individual/n45381",
     "name":"\tMichigan Journal of Community Service Learning",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tMichigan Journal of Community Service Learning",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n45381"},
    {"lastName":"",
     "profileUrl":"/individual/n21986",
     "name":"\tOppenheimer Dissertation Completion Fellowship",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tOppenheimer Dissertation Completion Fellowship",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n21986"},
    {"lastName":"",
     "profileUrl":"/individual/n17025",
     "name":"\tOutstanding Scholar of the Year, Phi Kappa Phi",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tOutstanding Scholar of the Year, Phi Kappa Phi",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n17025"},
    {"lastName":"",
     "profileUrl":"/individual/n43776",
     "name":"\tPublications of the Modern Language Association of America",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tPublications of the Modern Language Association of America",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n43776"},
    {"lastName":"",
     "profileUrl":"/individual/n5820",
     "name":"\tSmithsonian/CAORC Grant ",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tSmithsonian/CAORC Grant ",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n5820"},
    {"lastName":"",
     "profileUrl":"/individual/n32632",
     "name":"\tSociety of Biblical Literature Regional Scholar Award",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tSociety of Biblical Literature Regional Scholar Award",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n32632"},
    {"lastName":"",
     "profileUrl":"/individual/n9154",
     "name":"\tWoodrow Wilson Dissertation Grant in Women's Studies",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tWoodrow Wilson Dissertation Grant in Women's Studies",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n9154"},
    {"lastName":"",
     "profileUrl":"/individual/AutophagyanInnateImmuneResponsetoIntracellularPathogens",
     "name":" \t  Autophagy, an Innate Immune Response to Intracellular Pathogens",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Autophagy, an Innate Immune Response to Intracellular Pathogens",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/AutophagyanInnateImmuneResponsetoIntracellularPathogens"},
    {"lastName":"",
     "profileUrl":"/individual/DefiningHSPgp96grp94asaMasterChaperoneforTolllikeReceptors",
     "name":" \t  Defining HSP gp96/grp94 as a Master Chaperone for Toll-like Receptors",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Defining HSP gp96/grp94 as a Master Chaperone for Toll-like Receptors",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/DefiningHSPgp96grp94asaMasterChaperoneforTolllikeReceptors"},
    {"lastName":"",
     "profileUrl":"/individual/ImmuneSubversionandExploitationbySchistosomeWorms",
     "name":" \t  Immune Subversion and Exploitation by Schistosome Worms",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Immune Subversion and Exploitation by Schistosome Worms",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/ImmuneSubversionandExploitationbySchistosomeWorms"},
    {"lastName":"",
     "profileUrl":"/individual/OuterMembraneVesiclesTurningBacterialStressIntoVirulence",
     "name":" \t  Outer Membrane Vesicles: Turning Bacterial Stress Into Virulence",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Outer Membrane Vesicles: Turning Bacterial Stress Into Virulence",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/OuterMembraneVesiclesTurningBacterialStressIntoVirulence"},
    {"lastName":"",
     "profileUrl":"/individual/PlasmodiumInducedInflammationandDendriticCellImmuneResponse",
     "name":" \t  Plasmodium Induced Inflammation and Dendritic Cell Immune Response",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Plasmodium Induced Inflammation and Dendritic Cell Immune Response",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/PlasmodiumInducedInflammationandDendriticCellImmuneResponse"},
    {"lastName":"",
     "profileUrl":"/individual/RNAVirusesHijacktheHostCellsSecretoryPathwaytoBuildOrganellesCriticalforRNAReplication",
     "name":" \t  RNA Viruses Hijack the Host Cell's Secretory Pathway to Build Organelles Critical for RNA Replication",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  RNA Viruses Hijack the Host Cell's Secretory Pathway to Build Organelles Critical for RNA Replication",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/n223234"}
]}
"""


 val testCase2=""" 
{"errorMessage":"",
 "vclass":
    {"name":"Thing", "URI":"http://www.w3.org/2002/07/owl#Thing"},
 "totalCount":50,
 "pages":[
    {"index":"1",
     "text":"1",
     "param":"page=1"},
    {"index":"2",
     "text":"2",
     "param":"page=2"}],
 "letters":[
    {"text":"A",
     "param":"alpha=A"},
    {"text":"Y",
     "param":"alpha=Y"},
    {"text":"Z",
     "param":"alpha=Z"}],
 "individuals":[
    {"lastName":"",
     "profileUrl":"/individual/MissingEnergyattheLHCTheDarkMatterConnection",
     "name":"\t Missing Energy at the LHC: The Dark Matter Connection",
     "preferredTitle":"",
     "vclassName":"Lecture, Seminar, or Colloquium",
     "label":"\t Missing Energy at the LHC: The Dark Matter Connection",
     "firstName":"",
     "moniker":"Lecture, Seminar, or Colloquium",
     "URI":"http://vivo.cornell.edu/individual/MissingEnergyattheLHCTheDarkMatterConnection"},
    {"lastName":"",
     "profileUrl":"/individual/VectorlikeConfinementanditsSignaturesattheLHC",
     "name":"\t Vectorlike Confinement and its Signatures at the LHC ",
     "preferredTitle":"",
     "vclassName":"Lecture, Seminar, or Colloquium",
     "label":"\t Vectorlike Confinement and its Signatures at the LHC ",
     "firstName":"",
     "moniker":"Lecture, Seminar, or Colloquium",
     "URI":"http://vivo.cornell.edu/individual/VectorlikeConfinementanditsSignaturesattheLHC"},
    {"lastName":"",
     "profileUrl":"/individual/n51041",
     "name":"\tAWP Collection of Short Fiction Prize (runner-up)",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tAWP Collection of Short Fiction Prize (runner-up)",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n51041"},
    {"lastName":"",
     "profileUrl":"/individual/n29929",
     "name":"\tCollege Composition and Communication",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tCollege Composition and Communication",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n29929"},
    {"lastName":"",
     "profileUrl":"/individual/n63562",
     "name":"\tDerek Bok Award for Distinction in Teaching",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tDerek Bok Award for Distinction in Teaching",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n63562"},
    {"lastName":"",
     "profileUrl":"/individual/n16639",
     "name":"\tDerek Bok Award for Distinction in Teaching",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tDerek Bok Award for Distinction in Teaching",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n16639"},
    {"lastName":"",
     "profileUrl":"/individual/n53997",
     "name":"\tDerek Bok Award for Distinction in Teaching",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tDerek Bok Award for Distinction in Teaching",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n53997"},
    {"lastName":"",
     "profileUrl":"/individual/DrosophilaintestinalresponsetobacterialinfectionActivationofhostdefenseandstemcellproliferation",
     "name":"\tDrosophila intestinal response to bacterial infection: Activation of host defense and stem cell proliferation",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":"\tDrosophila intestinal response to bacterial infection: Activation of host defense and stem cell proliferation",
     "firstName":"",
     "moniker":"Jugatae Seminar",
     "URI":"http://vivo.cornell.edu/individual/DrosophilaintestinalresponsetobacterialinfectionActivationofhostdefenseandstemcellproliferation"},
    {"lastName":"",
     "profileUrl":"/individual/n31656",
     "name":"\tFulbright-Hays Fellowship at the University of Edinburgh",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tFulbright-Hays Fellowship at the University of Edinburgh",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n31656"},
    {"lastName":"",
     "profileUrl":"/individual/n64870",
     "name":"\tGLQ: A Journal of Lesbian and Gay Studies",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tGLQ: A Journal of Lesbian and Gay Studies",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n64870"},
    {"lastName":"",
     "profileUrl":"/individual/n110138",
     "name":"\tHelene Wurlitzer Foundation Residency",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tHelene Wurlitzer Foundation Residency",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n110138"},
    {"lastName":"",
     "profileUrl":"/individual/n24164",
     "name":"\tHelene Wurlitzer Foundation Residency",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tHelene Wurlitzer Foundation Residency",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n24164"},
    {"lastName":"",
     "profileUrl":"/individual/n34309",
     "name":"\tJohn Hope Franklin Center Research Award, William R. Perkins Library",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tJohn Hope Franklin Center Research Award, William R. Perkins Library",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n34309"},
    {"lastName":"",
     "profileUrl":"/individual/n29295",
     "name":"\tLuigi Einaudi Fellowship, Institute for European Studies",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tLuigi Einaudi Fellowship, Institute for European Studies",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n29295"},
    {"lastName":"",
     "profileUrl":"/individual/n49064",
     "name":"\tMarjorie Harris Weiss Memorial Premium",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tMarjorie Harris Weiss Memorial Premium",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n49064"},
    {"lastName":"",
     "profileUrl":"/individual/n60842",
     "name":"\tMcLean Fellow at the Library Company of Philadelphia",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tMcLean Fellow at the Library Company of Philadelphia",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n60842"},
    {"lastName":"",
     "profileUrl":"/individual/n61466",
     "name":"\tMcMaster Old English Studies and Texts",
     "preferredTitle":"",
     "vclassName":"Series",
     "label":"\tMcMaster Old English Studies and Texts",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n61466"},
    {"lastName":"",
     "profileUrl":"/individual/n45381",
     "name":"\tMichigan Journal of Community Service Learning",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tMichigan Journal of Community Service Learning",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n45381"},
    {"lastName":"",
     "profileUrl":"/individual/n21986",
     "name":"\tOppenheimer Dissertation Completion Fellowship",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tOppenheimer Dissertation Completion Fellowship",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n21986"},
    {"lastName":"",
     "profileUrl":"/individual/n17025",
     "name":"\tOutstanding Scholar of the Year, Phi Kappa Phi",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tOutstanding Scholar of the Year, Phi Kappa Phi",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n17025"},
    {"lastName":"",
     "profileUrl":"/individual/n43776",
     "name":"\tPublications of the Modern Language Association of America",
     "preferredTitle":"",
     "vclassName":"Journal",
     "label":"\tPublications of the Modern Language Association of America",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n43776"},
    {"lastName":"",
     "profileUrl":"/individual/n5820",
     "name":"\tSmithsonian/CAORC Grant ",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tSmithsonian/CAORC Grant ",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n5820"},
    {"lastName":"",
     "profileUrl":"/individual/n32632",
     "name":"\tSociety of Biblical Literature Regional Scholar Award",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tSociety of Biblical Literature Regional Scholar Award",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n32632"},
    {"lastName":"",
     "profileUrl":"/individual/n9154",
     "name":"\tWoodrow Wilson Dissertation Grant in Women's Studies",
     "preferredTitle":"",
     "vclassName":"Award or Honor Receipt",
     "label":"\tWoodrow Wilson Dissertation Grant in Women's Studies",
     "firstName":"",
     "moniker":"",
     "URI":"http://vivo.cornell.edu/individual/n9154"},
    {"lastName":"",
     "profileUrl":"/individual/AutophagyanInnateImmuneResponsetoIntracellularPathogens",
     "name":" \t  Autophagy, an Innate Immune Response to Intracellular Pathogens",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Autophagy, an Innate Immune Response to Intracellular Pathogens",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/AutophagyanInnateImmuneResponsetoIntracellularPathogens"},
    {"lastName":"",
     "profileUrl":"/individual/DefiningHSPgp96grp94asaMasterChaperoneforTolllikeReceptors",
     "name":" \t  Defining HSP gp96/grp94 as a Master Chaperone for Toll-like Receptors",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Defining HSP gp96/grp94 as a Master Chaperone for Toll-like Receptors",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/DefiningHSPgp96grp94asaMasterChaperoneforTolllikeReceptors"},
    {"lastName":"",
     "profileUrl":"/individual/ImmuneSubversionandExploitationbySchistosomeWorms",
     "name":" \t  Immune Subversion and Exploitation by Schistosome Worms",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Immune Subversion and Exploitation by Schistosome Worms",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/ImmuneSubversionandExploitationbySchistosomeWorms"},
    {"lastName":"",
     "profileUrl":"/individual/OuterMembraneVesiclesTurningBacterialStressIntoVirulence",
     "name":" \t  Outer Membrane Vesicles: Turning Bacterial Stress Into Virulence",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Outer Membrane Vesicles: Turning Bacterial Stress Into Virulence",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/OuterMembraneVesiclesTurningBacterialStressIntoVirulence"},
    {"lastName":"",
     "profileUrl":"/individual/PlasmodiumInducedInflammationandDendriticCellImmuneResponse",
     "name":" \t  Plasmodium Induced Inflammation and Dendritic Cell Immune Response",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  Plasmodium Induced Inflammation and Dendritic Cell Immune Response",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/individual/PlasmodiumInducedInflammationandDendriticCellImmuneResponse"},
    {"lastName":"",
     "profileUrl":"/individual/RNAVirusesHijacktheHostCellsSecretoryPathwaytoBuildOrganellesCriticalforRNAReplication",
     "name":" \t  RNA Viruses Hijack the Host Cell's Secretory Pathway to Build Organelles Critical for RNA Replication",
     "preferredTitle":"",
     "vclassName":"Past Lecture, Seminar, or Colloquium",
     "label":" \t  RNA Viruses Hijack the Host Cell's Secretory Pathway to Build Organelles Critical for RNA Replication",
     "firstName":"",
     "moniker":"Infection and Immunity Seminar",
     "URI":"http://vivo.cornell.edu/inidividual/n23423"}
]}
"""

val testCase2IndividualUris = Array(
"http://vivo.cornell.edu/individual/MissingEnergyattheLHCTheDarkMatterConnection",
"http://vivo.cornell.edu/individual/VectorlikeConfinementanditsSignaturesattheLHC",
"http://vivo.cornell.edu/individual/n51041",
"http://vivo.cornell.edu/individual/n29929",
"http://vivo.cornell.edu/individual/n63562",
"http://vivo.cornell.edu/individual/n16639",
"http://vivo.cornell.edu/individual/n53997",
"http://vivo.cornell.edu/individual/DrosophilaintestinalresponsetobacterialinfectionActivationofhostdefenseandstemcellproliferation",
"http://vivo.cornell.edu/individual/n31656",
"http://vivo.cornell.edu/individual/n64870",
"http://vivo.cornell.edu/individual/n110138",
"http://vivo.cornell.edu/individual/n24164",
"http://vivo.cornell.edu/individual/n34309",
"http://vivo.cornell.edu/individual/n29295",
"http://vivo.cornell.edu/individual/n49064",
"http://vivo.cornell.edu/individual/n60842",
"http://vivo.cornell.edu/individual/n61466",
"http://vivo.cornell.edu/individual/n45381",
"http://vivo.cornell.edu/individual/n21986",
"http://vivo.cornell.edu/individual/n17025",
"http://vivo.cornell.edu/individual/n43776",
"http://vivo.cornell.edu/individual/n5820",
"http://vivo.cornell.edu/individual/n32632",
"http://vivo.cornell.edu/individual/n9154",
"http://vivo.cornell.edu/individual/AutophagyanInnateImmuneResponsetoIntracellularPathogens",
"http://vivo.cornell.edu/individual/DefiningHSPgp96grp94asaMasterChaperoneforTolllikeReceptors",
"http://vivo.cornell.edu/individual/ImmuneSubversionandExploitationbySchistosomeWorms",
"http://vivo.cornell.edu/individual/OuterMembraneVesiclesTurningBacterialStressIntoVirulence",
"http://vivo.cornell.edu/individual/PlasmodiumInducedInflammationandDendriticCellImmuneResponse",
"http://vivo.cornell.edu/inidividual/n23423")

}

