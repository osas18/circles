package uk.ac.dundee.computing.servlets;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uk.ac.dundee.computing.aec.lib.Convertors;
import uk.ac.dundee.computing.stores.Circle;
import uk.ac.dundee.computing.stores.Town;

/**
 * Servlet implementation class Towns
 */
@WebServlet({ "/Towns", "/Towns/*" })
public class Towns extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LinkedList<Town> ccl= new LinkedList();   
     
	String name[]={
            "Aaron's Hill",
"Abbas Combe",
"Abberley",
"Abberton",
"Abberton",
"Abbess End",
"Abbess Roding",
"Abbey",
"Abbeycwmhir",
"Abbeydale",
"Abbeydale",
"Abbeydale Park",
"Abbey Dore",
"Abbey Field",
"Abbey Gate",
"Abbey Gate",
"Abbey Green",
"Abbey Green",
"Abbey Hey",
"Abbeyhill",
"Abbey Hulton",
"Abbey Mead",
"Abbey St Bathans",
"Abbeystead",
"Abbeytown",
"Abbey Village",
"Abbey Wood",
"Abbey Yard",
"Abbots Bickington",
"Abbots Bromley",
"Abbotsbury",
"Abbotsford",
"Abbotsham",
"Abbotskerswell",
"Abbots Langley",
"Abbotsleigh",
"Abbots Leigh",
"Abbotsley",
"Abbot's Meads",
"Abbots Morton",
"Abbots Ripton",
"Abbot's Salford",
"Abbotstone",
"Abbotswood",
"Abbots Worthy",
"Abbotts Ann",
"Abcott",
"Abdon",
"Abdy",
"Aberaeron",
"Aberaman",
"Aberangell",
"Aber Arad",
"Aberarder",
"Aberargie",
"Aberarth",
"Aberavon",
"Aber-banc",
"Aberbargoed/Aberbargod",
"Aberbechan",
"Aberbeeg",
"Aberbran",
"Abercanaid",
"Abercarn",
"Abercastle",
"Abercegir",
"Aberchalder",
"Aberchirder",
"Abercorn",
"Abercraf",
"Abercregan",
"Abercrombie",
"Abercwmboi",
"Abercych",
"Abercynon",
"Aber-Cywarch",
"Aberdalgie",
"Aberdare/Aberdar",
"Aberdaron",
"Aberdeen",
"Aberdesach",
"Aberdour",
"Aberdulais",
"Aberdyfi",
"Abereiddy",
"Abererch",
"Aberfan",
"Aberfeldy",
"Aberffraw",
"Aberffrwd",
"Aberffrwd",
"Aberford",
"Aberfoyle",
"Abergarw",
"Abergarwed",
"Abergavenny/Y Fenni",
"Abergele",
"Aber-GiÃ¢r",
"Abergorlech",
"Abergwesyn",
"Abergwili",
"Abergwynfi",
"Abergwyngregyn",
"Abergynolwyn",
"Aberhosan",
"Aberkenfig",
"Aberlady",
"Aberlemno",
"Aberlerry",
"Aberllefenni",
"Abermagwr",
"Abermorddu",
"Abermule/Aber-miwl",
"Abernant",
"Abernant",
"Abernethy",
"Abernyte",
"Aber-oer",
"Aberporth",
"Abersoch",
"Abersychan",
"Aberthin",
"Abertillery/Abertyleri",
"Abertridwr",
"Abertridwr",
"Abertrinant",
"Abertysswg",
"Aberuthven",
"Aber Village",
"Aberwheeler/Aberchwiler",
"Aberyscir",
"Aberystwyth",
"Abhainn Suidhe",
"Abingdon-on-Thames",
"Abinger Common",
"Abinger Hammer",
"Abington",
"Abington",
"Abington Pigotts",
"Abington Vale",
"Abingworth",
"Ab Kettleby",
"Ab Lench",
"Ablington",
"Ablington",
"Abney",
"Aboyne",
"Abraham Heights",
"Abram",
"Abriachan",
"Abridge",
"Abronhill",
"Abshot",
"Abson",
"Abthorpe",
"Abune-the-hill",
"Aby",
"Acarsaid",
"Acaster Malbis",
"Acaster Selby",
"Accrington",
"Acha",
"Achachork",
"Achadh nan Darach",
"Achahoish",
"Achaleven",
"Achalone",
"Acha MÃ²r",
"Achanelid",
"Ach'an Tobhair",
"Achaphubuil",
"Acharacle/Ath-Tharracail",
"Achargary",
"Acharn",
"Acharn",
"Achavandra Muir",
"Achddu",
"Achfary",
"Achfrish",
"Achgarve",
"Achiemore",
"A' Chill",
"Achiltibuie",
"Achina",
"Achininver",
"Achintee",
"Achintraid",
"Achleck",
"Achluachrach",
"Achlyness",
"Achmelvich",
"Achmore",
"Achmore",
"Achnacarnin",
"Achnacarry",
"Achnacloich/Ach na Cloiche",
"Achnacroish",
"Achnaha",
"Achnahanat",
"Achnahannet",
"Achnahard",
"Achnahuaigh",
"Achnairn",
"Achnamara",
"Achnasheen/Achadh na Sine",
"Achosnich",
"Achreamie",
"Achriesgill",
"Achrimsdale",
"Achtalean",
"Achterneed",
"Achtoty",
"Achurch",
"Achuvoldrach",
"Ackenthwaite",
"Ackergill",
"Acklam",
"Acklam",
"Ackleton",
"Acklington",
"Ackton",
"Ackworth Moor Top",
"Acle",
"Acock's Green",
"Acol",
"Acomb",
"Acomb",
"Acre",
"Acrefair",
"Acres Nook",
"Acton",
"Acton",
"Acton",
"Acton",
"Acton",
"Acton",
"Acton",
"Acton",
"Acton",
"Acton Beauchamp",
"Acton Bridge",
"Acton Burnell",
"Acton Green",
"Acton Green",
"Acton Pigott",
"Acton Place",
"Acton Reynald",
"Acton Round",
"Acton Scott",
"Acton Trussell",
"Acton Turville",
"Adabroc",
"Adambrae",
"Adam's Green",
"Adbaston",
"Adber",
"Adbolton",
"Adderbury",
"Adderley",
"Adderley Green",
"Addiewell",
"Addingham",
"Addingham Moorside",
"Addington",
"Addington",
"Addington",
"Addington",
"Addinston",
"Addiscombe",
"Addlestone",
"Addlestonemoor",
"Addlethorpe",
"Adel",
"Adeney",
"Adeyfield",
"Adfa",
"Adforton",
"Adgestone",
"Adisham",
"Adlestrop",
"Adlingfleet",
"Adlington",
"Adlington",
"Adlington Park",
"Admaston",
"Admaston",
"Admington",
"Adpar",
"Adsborough",
"Adscombe",
"Adstock",
"Adstone",
"Adswood",
"Adversane",
"Advie",
"Adwalton",
"Adwell",
"Adwick Le Street",
"Adwick upon Dearne",
"Ae",
"Affetside",
"Affleck",
"Affpuddle",
"Afon Eitha",
"Afon-wen",
"Afon Wen",
"Afton",
"Agar Nook",
"Agbrigg",
"Aggborough",
"Agglethorpe",
"Aghacommon",
"Aghadowey",
"Aghadrumsee",
"Aghagallon",
"Aghalee",
"Aglionby",
"Agneash",
"Ahoghill",
"Aifft",
"Aigburth",
"Aiginis",
"Aike",
"Aiketgate",
"Aikton",
"Ailby",
"Ailstone",
"Ailsworth",
"Aimes Green",
"Ainderby Quernhow",
"Ainderby Steeple",
"Aingers Green",
"Ainley Top",
"Ainsdale",
"Ainsdale-on-Sea",
"Ainstable",
"Ainsworth",
"Ainthorpe",
"Aintree",
"Aird",
"Aird",
"Ã€ird Adhanais",
"Ã€ird a' Mhachair",
"Ã€ird a' Mhulaidh",
"Aird/An Ã€ird",
"Ã€ird Asaig",
"Ã€ird Choinnich",
"Ã€ird Dhail",
"Airdens",
"Ã€ird Mhidhinis",
"Ã€ird Mhighe",
"Ã€ird MhÃ¬ghe",
"Ã€ird MhÃ²r",
"Ã€ird MhÃ²r",
"Ã€ird na Monadh",
"Ã€ird nan StrÃ¹ban",
"Airdrie",
"Ã€ird Ruairidh",
"Ã€ird Shleibhe",
"Ã€ird Thunga",
"Airdtorrisdale",
"Ã€ird Uig",
"Airedale",
"Aire View",
"Airidh a Bhruaich",
"Airlie",
"Airmyn",
"Airntully",
"Airor",
"Airth",
"Airthrey Castle",
"Airton",
"Airy Hill",
"Aisby",
"Aisby",
"Aisgernis",
"Aish",
"Aish",
"Aisholt",
"Aiskew",
"Aislaby",
"Aislaby",
"Aislaby",
"Aisthorpe",
"Aith",
"Aithnen",
"Aithsetter",
"Akeld",
"Akeley",
"Akenham",
"Albany",
"Alberbury",
"Albert Town",
"Albert Village",
"Albourne",
"Albourne Green",
"Albrighton",
"Albrighton",
"Albro Castle",
"Alburgh",
"Albury",
"Albury",
"Albury End",
"Albury Heath",
"Albyfield",
"Alby Hill",
"Alcaig",
"Alcaston",
"Alcester",
"Alcester",
"Alcester Lane's End",
"Alciston",
"Alcombe",
"Alcombe",
"Alconbury",
"Alconbury Weston",
"Aldborough",
"Aldborough",
"Aldborough Hatch",
"Aldbourne",
"Aldbrough",
"Aldbrough St John",
"Aldbury",
"Aldcliffe",
"Aldclune",
"Aldeburgh",
"Aldeby",
"Aldenham",
"Alderbrook",
"Alderbury",
"Aldercar",
"Alderford",
"Alder Forest",
"Aldergrove",
"Alderholt",
"Alderley",
"Alderley Edge",
"Alderman's Green",
"Aldermaston",
"Aldermaston Soke",
"Aldermaston Wharf",
"Alderminster",
"Aldermoor",
"Alder Moor",
"Alderney",
"Alder Row",
"Aldersbrook",
"Alder's End",
"Aldersey Green",
"Aldersey Park",
"Aldershawe",
"Aldershot",
"Alderton",
"Alderton",
"Alderton",
"Alderton",
"Alderton",
"Alderton Fields",
"Alderwasley",
"Aldfield",
"Aldford",
"Aldgate",
"Aldgate",
"Aldham",
"Aldham",
"Aldingbourne",
"Aldingham",
"Aldington",
"Aldington",
"Aldington Frith",
"Aldon",
"Aldoth",
"Aldreth",
"Aldridge",
"Aldringham",
"Aldrington",
"Aldsworth",
"Aldwark",
"Aldwark",
"Aldwarke",
"Aldwick",
"Aldwincle",
"Aldworth",
"Aldwych",
"Ale Oak",
"Alexandria",
"Aley",
"Aley Green",
"Alfardisworthy",
"Alfington",
"Alfold",
"Alfold Bars",
"Alfold Crossways",
"Alford",
"Alford",
"Alford",
"Alfred's Well",
"Alfreton",
"Alfrick",
"Alfrick Pound"
	};
	
double dLat[]={
51.18276,
51.00113,
52.30502,
51.8381,
52.17975,
51.78,
51.78,
50.88764,
52.33342,
51.84693,
53.33841,
53.32049,
51.96955,
51.88336,
50.77278,
51.29857,
52.89665,
53.11468,
53.46514,
55.95803,
53.03371,
51.39692,
55.85512,
53.98471,
54.84249,
53.69772,
51.4864,
54.95903,
50.89833,
52.81797,
50.66761,
50.96914,
51.01625,
50.50507,
51.70157,
50.32428,
51.45864,
52.19314,
53.20112,
52.19773,
52.38162,
52.15274,
51.10702,
51.25382,
51.08968,
51.18981,
52.40115,
52.47477,
53.48143,
52.23895,
51.70357,
52.67985,
52.03723,
56.95353,
56.3245,
52.24849,
51.59954,
52.04741,
51.69686,
52.53247,
51.71571,
51.95469,
51.72223,
51.6438,
51.9585,
52.59811,
57.09263,
57.56102,
55.99071,
51.79855,
51.65559,
56.2126,
51.68576,
52.03506,
51.65082,
52.7252,
56.36773,
51.71238,
52.80509,
57.14932,
53.03752,
56.05556,
51.68086,
52.54868,
51.9382,
52.90191,
51.6956,
56.62331,
53.18808,
52.38869,
51.78043,
53.83195,
56.17425,
51.54893,
51.70868,
51.82465,
53.28394,
52.05167,
51.98189,
52.15886,
51.87006,
51.65639,
53.23245,
52.64002,
52.56217,
51.53955,
56.00544,
56.68881,
52.51249,
52.66932,
52.34328,
53.10115,
52.54193,
51.88513,
52.56904,
56.33383,
56.46971,
53.03798,
52.13449,
52.82761,
51.72538,
51.46969,
51.73369,
51.59752,
52.76445,
52.63004,
51.7415,
56.32077,
51.88485,
53.21482,
51.95488,
52.41314,
57.96729,
51.68291,
51.19785,
51.21621,
52.24623,
55.49365,
52.08348,
52.24609,
50.93737,
52.80419,
52.16177,
51.76608,
51.21749,
53.31208,
57.07506,
54.04668,
53.50869,
57.38691,
51.64821,
55.9571,
50.84674,
51.46869,
52.11307,
59.13727,
53.28459,
56.78124,
53.90237,
53.86654,
53.75228,
56.59761,
57.42943,
56.64865,
55.93936,
56.44743,
58.48848,
58.16346,
56.0387,
56.8049,
56.84037,
56.741,
58.46008,
56.87436,
56.56689,
57.914,
51.69066,
58.31086,
58.07824,
57.88069,
58.50062,
57.05909,
58.0216,
58.51334,
58.54517,
57.41726,
57.38573,
56.53021,
56.89378,
58.42549,
58.16639,
57.914,
57.34138,
58.23768,
56.94267,
57.10438,
56.50751,
56.73902,
57.95097,
57.32648,
56.332,
58.54549,
58.07791,
56.02857,
57.57916,
56.72897,
58.57531,
58.44383,
58.03409,
57.43839,
57.6,
58.53038,
52.43088,
58.491,
54.22681,
58.46497,
54.55043,
54.04351,
52.58384,
55.30708,
53.68831,
53.64321,
52.6389,
52.44934,
51.35978,
54.99304,
53.94742,
53.55508,
52.98392,
53.0785,
53.07747,
50.60622,
51.51352,
52.45414,
52.97057,
52.06645,
54.517,
52.3054,
53.05672,
52.15182,
53.27493,
52.60928,
51.5016,
52.15193,
52.61835,
52.07577,
52.80703,
52.55611,
52.50066,
52.76406,
51.52307,
58.48978,
55.87317,
50.8652,
52.84449,
50.98247,
52.94049,
52.0159,
52.95182,
52.99775,
55.8452,
53.94156,
53.92358,
51.95001,
50.4633,
51.3583,
51.31055,
55.77249,
51.381,
51.36996,
51.37894,
53.19115,
53.85101,
52.76329,
51.75588,
52.60304,
52.33834,
50.66614,
51.23727,
51.94546,
53.68314,
53.32136,
53.61655,
53.59842,
52.70893,
52.80902,
52.11644,
52.04591,
51.06024,
51.13096,
51.96813,
52.15858,
53.39321,
51.00086,
57.39247,
53.75234,
51.68996,
53.5614,
53.50805,
55.18932,
53.61747,
57.30189,
50.74078,
53.00216,
53.23346,
52.91236,
50.67714,
52.72624,
53.67084,
52.37729,
54.27408,
54.468,
55.029,
54.2286,
54.509,
54.52024,
54.90013,
54.25018,
54.867,
53.21516,
53.37176,
58.20929,
53.89515,
54.8107,
54.87099,
53.26609,
52.15241,
52.5729,
51.70391,
54.21907,
54.32698,
51.84303,
53.67185,
53.60456,
53.6043,
54.81119,
53.59055,
54.46699,
53.4795,
58.24065,
57.46498,
57.85354,
57.38307,
57.99426,
57.03269,
57.91947,
57.39272,
58.46843,
57.90963,
57.00533,
57.782,
57.82933,
57.38661,
57.00533,
57.3852,
57.49744,
55.8668,
57.16844,
57.80184,
58.24397,
58.53038,
58.22742,
53.72393,
53.91465,
58.06068,
56.64129,
53.72088,
56.50283,
57.08361,
56.06753,
56.14643,
54.0314,
54.47298,
53.42205,
52.93431,
57.19527,
50.42981,
50.41498,
51.11312,
54.29139,
54.5062,
54.25931,
54.46469,
53.31301,
60.28222,
52.79419,
60.05681,
55.55916,
52.03144,
52.09325,
54.91134,
52.7244,
51.80029,
52.76325,
50.93408,
50.93408,
52.76173,
52.63793,
52.08635,
52.42912,
51.90057,
51.21696,
51.89184,
51.20779,
54.8652,
52.8632,
57.58467,
52.48269,
51.0017,
52.21565,
52.42244,
50.82948,
51.19931,
51.42417,
52.36475,
52.37395,
52.8636,
54.09282,
51.5845,
51.47784,
53.82786,
54.49842,
51.80283,
54.03769,
56.74998,
52.15172,
52.48414,
51.67381,
51.04462,
51.03756,
53.02295,
52.72239,
53.49163,
54.64472,
50.91183,
51.61283,
53.30322,
52.44831,
51.38544,
51.36724,
51.40331,
52.13431,
50.9376,
52.84454,
50.75008,
51.19028,
51.56887,
52.05261,
53.103,
53.1029,
52.66512,
51.24712,
51.99994,
52.11182,
52.80667,
52.02232,
51.54115,
51.99095,
53.0778,
54.12069,
53.12944,
51.5132,
52.62933,
51.90377,
52.0701,
50.84164,
54.13435,
51.09062,
52.0988,
51.09134,
52.41057,
54.82402,
52.34055,
52.60226,
52.1885,
50.835,
51.79294,
53.11421,
54.06535,
53.4454,
50.77887,
52.42226,
51.51171,
51.5132,
52.45294,
55.99053,
51.13096,
51.85494,
50.87778,
50.7793,
51.10047,
51.09148,
51.10928,
57.23723,
53.25656,
51.09044,
52.35054,
53.0951,
52.17916,
52.17017,
};

double dLong[]={
-0.63503,
-2.42178,
-2.37541,
0.90891,
-2.00873,
0.28172,
0.28172,
-3.2169,
-3.38828,
-2.19738,
-1.51337,
-1.52859,
-2.89663,
0.8973,
-3.00118,
0.51599,
-2.73726,
-2.0388,
-2.15963,
-3.16277,
-2.1282,
-0.49929,
-2.37696,
-2.66485,
-3.28619,
-2.53915,
0.1109,
-3.97713,
-4.29798,
-1.87532,
-2.60274,
-0.14281,
-4.24677,
-3.61599,
-0.41688,
-3.6801,
-2.65628,
-0.20928,
-2.90716,
-1.96484,
-0.18697,
-1.90641,
-1.19435,
-0.56128,
-1.2946,
-1.53633,
-2.89065,
-2.62713,
-1.34598,
-4.26409,
-3.4268,
-3.70989,
-4.45802,
-4.50913,
-3.35177,
-4.23528,
-3.79895,
-4.40024,
-3.22402,
-3.27661,
-3.13767,
-3.47842,
-3.36948,
-3.13587,
-5.12332,
-3.76576,
-4.73314,
-2.62841,
-3.46835,
-3.71984,
-3.6566,
-2.78352,
-3.41177,
-4.55997,
-3.32396,
-3.68205,
-3.499,
-3.44155,
-4.70886,
-2.12559,
-4.35048,
-3.29417,
-3.77324,
-4.04401,
-5.20922,
-4.38774,
-3.33973,
-3.86771,
-4.4635,
-3.93374,
-2.93636,
-1.34054,
-4.37748,
-3.56618,
-3.71643,
-3.02433,
-3.58391,
-4.18168,
-4.06179,
-3.67522,
-4.27457,
-3.5988,
-4.01652,
-3.95959,
-3.76432,
-3.5947,
-2.8595,
-2.77706,
-4.05707,
-3.813,
-3.96112,
-3.03947,
-3.23265,
-4.42065,
-3.21865,
-3.31975,
-3.21083,
-3.06778,
-4.53644,
-4.50242,
-3.06552,
-3.43389,
-3.13812,
-3.26466,
-3.4316,
-4.01825,
-3.25419,
-3.65886,
-3.30176,
-3.35671,
-3.46387,
-4.08185,
-6.99897,
-1.25649,
-0.40558,
-0.43358,
-0.86629,
-3.68723,
-0.09691,
-0.85165,
-0.42874,
-0.92601,
-1.97949,
-1.84925,
-1.77946,
-1.70879,
-2.78512,
-2.81857,
-2.59706,
-4.40556,
0.11609,
-3.94762,
-1.26986,
-2.42608,
-1.05952,
-3.25124,
0.12106,
-5.95504,
-1.11113,
-1.1271,
-2.37303,
-6.58795,
-6.20819,
-5.25567,
-5.54828,
-5.38452,
-3.45108,
-6.56695,
-5.20408,
-5.12175,
-5.1411,
-5.80354,
-4.187,
-3.17467,
-4.02769,
-4.06929,
-4.25109,
-4.91192,
-4.43495,
-5.56884,
-3.89776,
-6.51277,
-5.3457,
-4.22466,
-4.45009,
-5.42362,
-5.58714,
-6.20544,
-4.78428,
-5.00704,
-5.30828,
-5.33568,
-5.56618,
-5.33196,
-5.0017,
-5.97293,
-5.48742,
-6.14696,
-4.51082,
-3.70393,
-6.21596,
-4.43292,
-4.45189,
-5.57252,
-5.0707,
-6.17857,
-3.69543,
-4.99147,
-3.85604,
-6.20922,
-4.53678,
-4.27727,
-0.49384,
-4.46347,
-2.76077,
-3.10727,
-1.2517,
-0.80268,
-2.33351,
-1.64711,
-1.37307,
-1.34348,
1.55313,
-1.83222,
1.30949,
-2.10312,
-1.12541,
-2.09959,
-3.08134,
-2.23283,
-2.54629,
-2.02256,
-0.27066,
-3.00945,
-2.26203,
0.76322,
-6.633,
-2.22875,
-2.97872,
-2.47642,
-2.60879,
-2.68812,
-0.26533,
-2.44719,
-2.67349,
0.7492,
-2.69124,
-2.53979,
-2.80428,
-2.09777,
-2.28246,
-6.23146,
-3.52784,
-2.64791,
-2.35035,
-2.57831,
-1.1012,
-1.30927,
-2.50006,
-2.1281,
-3.6066,
-1.88723,
-1.88728,
-0.91743,
-4.46,
-0.0305,
0.37315,
-2.75872,
-0.0663,
-0.50018,
-0.49988,
0.31105,
-1.58346,
-2.43861,
-0.44396,
-3.39679,
-2.87471,
-1.15946,
1.18605,
-1.64497,
-0.72208,
-2.12906,
-2.59858,
-2.62855,
-2.54168,
-1.91985,
-1.70203,
-4.47308,
-3.03591,
-3.16612,
-0.93155,
-1.13165,
-2.17439,
-0.46935,
-3.45741,
-1.64509,
-0.99597,
-1.19378,
-1.28526,
-3.5958,
-2.37184,
-2.22568,
-2.27772,
-3.05199,
-3.29737,
-4.31395,
-1.51309,
-1.32772,
-1.47928,
-2.24381,
-1.87097,
-6.383,
-6.652,
-7.2728,
-6.294,
-6.27113,
-2.86698,
-4.40358,
-6.367,
-3.32677,
-2.92581,
-6.28318,
-0.41125,
-2.80282,
-3.13127,
0.15014,
-1.70179,
-0.35617,
0.01738,
-1.47241,
-1.48641,
1.06894,
-1.82741,
-3.03668,
-3.0669,
-2.72504,
-2.3565,
-0.91379,
-2.94322,
-6.15054,
-7.39759,
-6.67942,
-7.41884,
-6.76556,
-5.96526,
-6.84015,
-7.4036,
-6.33187,
-4.32224,
-7.41312,
-6.90591,
-6.8449,
-7.33604,
-7.41312,
-7.36916,
-7.26867,
-3.97506,
-7.38731,
-6.85805,
-6.32147,
-4.27727,
-7.01854,
-1.31192,
-2.0091,
-6.67259,
-3.11849,
-0.90279,
-3.47184,
-5.77254,
-3.77648,
-3.9089,
-2.14652,
-0.62043,
-0.68477,
-0.4913,
-7.39122,
-3.83871,
-3.627,
-3.15138,
-1.57903,
-1.37606,
-0.81179,
-0.68242,
-0.58305,
-1.37798,
-3.18045,
-1.20263,
-2.0729,
-0.97377,
1.1299,
-1.54139,
-2.94165,
-4.98181,
-1.54945,
-0.20114,
-0.20114,
-2.7498,
-2.27481,
-4.67969,
1.34493,
0.08432,
-0.49083,
0.06938,
-0.47682,
-2.71042,
1.25937,
-4.40187,
-2.80395,
-2.20802,
-1.87701,
-1.89114,
0.13565,
-3.48273,
-2.28184,
-0.26109,
-0.27542,
1.24454,
-1.38228,
0.0991,
-1.61981,
-0.1099,
-1.68499,
-0.60188,
-2.81839,
-3.80858,
1.6019,
1.6143,
-0.36,
0.17406,
-1.73752,
-1.33803,
1.14517,
-2.37074,
-6.24306,
-1.82357,
-2.34078,
-2.23405,
-1.4791,
-1.14636,
-1.11797,
-1.13165,
-1.65808,
-1.43922,
-1.66738,
-1.93758,
-2.32334,
0.02582,
-2.54828,
-2.80053,
-2.81547,
-1.84618,
-0.76208,
-1.99413,
-0.91351,
-2.75057,
1.41653,
-2.23931,
-1.99413,
-1.53124,
-1.59606,
-2.87575,
-0.0777,
-0.54614,
0.79684,
0.98234,
-0.68762,
-3.09579,
0.94743,
-1.90653,
0.91891,
-2.83204,
-3.3323,
0.11963,
-1.92023,
1.57561,
-0.19075,
-1.77666,
-1.66531,
-1.29101,
-1.33148,
-0.70356,
-0.52355,
-1.20164,
-0.1167,
-3.14186,
-4.57464,
-3.16612,
-0.45506,
-4.42491,
-3.25663,
-0.52319,
-0.52348,
-0.50863,
-2.70573,
0.17965,
-2.56538,
-2.08217,
-1.38172,
-2.37434,
-2.37427
};

String county[]={
    "Surrey",
"Somerset",
"Worcestershire",
"Essex",
"Worcestershire",
"Essex",
"Essex",
"Devon",
"Powys",
"Gloucestershire",
"South Yorkshire",
"South Yorkshire",
"Herefordshire",
"Essex",
"Devon",
"Kent",
"Shropshire",
"Staffordshire",
"Greater Manchester",
"City of Edinburgh",
"Staffordshire",
"Surrey",
"Scottish Borders",
"Lancashire",
"Cumbria",
"Lancashire",
"Greater London (Greenwich)",
"Dumfries and Galloway",
"Devon",
"Staffordshire",
"Dorset",
"West Sussex",
"Devon",
"Devon",
"Hertfordshire",
"Devon",
"Somerset",
"Cambridgeshire",
"Cheshire",
"Worcestershire",
"Cambridgeshire",
"Warwickshire",
"Hampshire",
"Surrey",
"Hampshire",
"Hampshire",
"Shropshire",
"Shropshire",
"South Yorkshire",
"Ceredigion",
"Rhondda Cynon Taff",
"Gwynedd",
"Carmarthenshire",
"Highland",
"Perth and Kinross",
"Ceredigion",
"Neath Port Talbot",
"Ceredigion",
"Caerphilly",
"Powys",
"Blaenau Gwent",
"Powys",
"Merthyr Tydfil",
"Caerphilly",
"Pembrokeshire",
"Powys",
"Highland",
"Aberdeenshire",
"West Lothian",
"Powys",
"Neath Port Talbot",
"Fife",
"Rhondda Cynon Taff",
"Pembrokeshire",
"Rhondda Cynon Taff",
"Gwynedd",
"Perth and Kinross",
"Rhondda Cynon Taff",
"Gwynedd",
"Aberdeen City",
"Gwynedd",
"Fife",
"Neath Port Talbot",
"Gwynedd",
"Pembrokeshire",
"Gwynedd",
"Merthyr Tydfil",
"Perth and Kinross",
"Isle of Anglesey",
"Ceredigion",
"Monmouthshire",
"West Yorkshire",
"Stirling",
"Bridgend",
"Neath Port Talbot",
"Monmouthshire",
"Conwy",
"Carmarthenshire",
"Carmarthenshire",
"Powys",
"Carmarthenshire",
"Neath Port Talbot",
"Gwynedd",
"Gwynedd",
"Powys",
"Bridgend",
"East Lothian",
"Angus",
"Ceredigion",
"Gwynedd",
"Ceredigion",
"Flintshire",
"Powys",
"Carmarthenshire",
"Powys",
"Perth and Kinross",
"Perth and Kinross",
"Wrexham",
"Ceredigion",
"Gwynedd",
"Torfaen",
"The Vale of Glamorgan",
"Blaenau Gwent",
"Caerphilly",
"Powys",
"Gwynedd",
"Caerphilly",
"Perth and Kinross",
"Powys",
"Denbighshire",
"Powys",
"Ceredigion",
"Na h-Eileanan an Iar",
"Oxfordshire",
"Surrey",
"Surrey",
"Northamptonshire",
"South Lanarkshire",
"Cambridgeshire",
"Northamptonshire",
"West Sussex",
"Leicestershire",
"Worcestershire",
"Gloucestershire",
"Wiltshire",
"Derbyshire",
"Aberdeenshire",
"Lancashire",
"Greater Manchester",
"Highland",
"Essex",
"North Lanarkshire",
"Hampshire",
"Gloucestershire",
"Northamptonshire",
"Orkney Islands",
"Lincolnshire",
"Highland",
"North Yorkshire",
"North Yorkshire",
"Lancashire",
"Argyll and Bute",
"Highland",
"Highland",
"Argyll and Bute",
"Argyll and Bute",
"Highland",
"Na h-Eileanan an Iar",
"Argyll and Bute",
"Highland",
"Highland",
"Highland",
"Highland",
"Angus",
"Perth and Kinross",
"Highland",
"Carmarthenshire",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Argyll and Bute",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Argyll and Bute",
"Highland",
"Highland",
"Highland",
"Argyll and Bute",
"Highland",
"Highland",
"Argyll and Bute",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Highland",
"Northamptonshire",
"Highland",
"Cumbria",
"Highland",
"North Yorkshire",
"North Yorkshire",
"Shropshire",
"Northumberland",
"West Yorkshire",
"West Yorkshire",
"Norfolk",
"West Midlands",
"Kent",
"Northumberland",
"North Yorkshire",
"Greater Manchester",
"Wrexham",
"Staffordshire",
"Cheshire",
"Dorset",
"Greater London (Ealing)",
"Shropshire",
"Staffordshire",
"Suffolk",
"Tyrone",
"Worcestershire",
"Wrexham",
"Herefordshire",
"Cheshire",
"Shropshire",
"Greater London (Ealing)",
"Herefordshire",
"Shropshire",
"Suffolk",
"Shropshire",
"Shropshire",
"Shropshire",
"Staffordshire",
"Gloucestershire",
"Na h-Eileanan an Iar",
"West Lothian",
"Dorset",
"Staffordshire",
"Dorset",
"Nottinghamshire",
"Oxfordshire",
"Shropshire",
"Staffordshire",
"West Lothian",
"West Yorkshire",
"West Yorkshire",
"Buckinghamshire",
"Cornwall",
"Greater London (Croydon)",
"Kent",
"Scottish Borders",
"Greater London (Croydon)",
"Surrey",
"Surrey",
"Lincolnshire",
"West Yorkshire",
"Shropshire",
"Hertfordshire",
"Powys",
"Herefordshire",
"Isle of Wight",
"Kent",
"Gloucestershire",
"East Riding Of Yorkshire",
"Cheshire",
"Lancashire",
"Lancashire",
"Shropshire",
"Staffordshire",
"Warwickshire",
"Ceredigion",
"Somerset",
"Somerset",
"Buckinghamshire",
"Northamptonshire",
"Greater Manchester",
"West Sussex",
"Highland",
"West Yorkshire",
"Oxfordshire",
"South Yorkshire",
"South Yorkshire",
"Dumfries and Galloway",
"Greater Manchester",
"Aberdeenshire",
"Dorset",
"Wrexham",
"Flintshire",
"Gwynedd",
"Isle of Wight",
"Leicestershire",
"West Yorkshire",
"Worcestershire",
"North Yorkshire",
"Armagh",
"Londonderry",
"Fermanagh",
"Antrim",
"Antrim",
"Cumbria",
"Isle of Man",
"Antrim",
"Denbighshire",
"Merseyside",
"Na h-Eileanan an Iar",
"East Riding Of Yorkshire",
"Cumbria",
"Cumbria",
"Lincolnshire",
"Warwickshire",
"Cambridgeshire",
"Essex",
"North Yorkshire",
"North Yorkshire",
"Essex",
"West Yorkshire",
"Merseyside",
"Merseyside",
"Cumbria",
"Greater Manchester",
"North Yorkshire",
"Merseyside",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Highland",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Highland",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"North Lanarkshire",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Na h-Eileanan an Iar",
"Highland",
"Na h-Eileanan an Iar",
"West Yorkshire",
"North Yorkshire",
"Na h-Eileanan an Iar",
"Angus",
"North Yorkshire",
"Perth and Kinross",
"Highland",
"Falkirk",
"Stirling",
"North Yorkshire",
"North Yorkshire",
"Lincolnshire",
"Lincolnshire",
"Na h-Eileanan an Iar",
"Devon",
"Devon",
"Somerset",
"North Yorkshire",
"County Durham",
"North Yorkshire",
"North Yorkshire",
"Lincolnshire",
"Shetland Islands",
"Powys",
"Shetland Islands",
"Northumberland",
"Buckinghamshire",
"Suffolk",
"Tyne and Wear",
"Shropshire",
"Pembrokeshire",
"Leicestershire",
"West Sussex",
"West Sussex",
"Shropshire",
"Shropshire",
"Ceredigion",
"Norfolk",
"Hertfordshire",
"Surrey",
"Hertfordshire",
"Surrey",
"Cumbria",
"Norfolk",
"Highland",
"Shropshire",
"Dorset",
"Warwickshire",
"West Midlands",
"East Sussex",
"Somerset",
"Wiltshire",
"Cambridgeshire",
"Cambridgeshire",
"Norfolk",
"North Yorkshire",
"Greater London (Redbridge)",
"Wiltshire",
"East Riding Of Yorkshire",
"North Yorkshire",
"Hertfordshire",
"Lancashire",
"Perth and Kinross",
"Suffolk",
"Norfolk",
"Hertfordshire",
"East Sussex",
"Wiltshire",
"Derbyshire",
"Norfolk",
"Greater Manchester",
"Antrim",
"Dorset",
"Gloucestershire",
"Cheshire",
"West Midlands",
"Berkshire",
"Berkshire",
"Berkshire",
"Warwickshire",
"Hampshire",
"Staffordshire",
"Dorset",
"Somerset",
"Greater London (Redbridge)",
"Herefordshire",
"Cheshire",
"Cheshire",
"Staffordshire",
"Hampshire",
"Gloucestershire",
"Northamptonshire",
"Shropshire",
"Suffolk",
"Wiltshire",
"Gloucestershire",
"Derbyshire",
"North Yorkshire",
"Cheshire",
"Greater London (City of London)",
"Rutland",
"Essex",
"Suffolk",
"West Sussex",
"Cumbria",
"Kent",
"Worcestershire",
"Kent",
"Shropshire",
"Cumbria",
"Cambridgeshire",
"West Midlands",
"Suffolk",
"East Sussex",
"Gloucestershire",
"Derbyshire",
"North Yorkshire",
"South Yorkshire",
"West Sussex",
"Northamptonshire",
"Berkshire",
"Greater London (City of Westminster)",
"Shropshire",
"West Dunbartonshire",
"Somerset",
"Bedfordshire",
"Devon",
"Devon",
"Surrey",
"West Sussex",
"Surrey",
"Aberdeenshire",
"Lincolnshire",
"Somerset",
"Worcestershire",
"Derbyshire",
"Worcestershire",
"Worcestershire"
};
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Towns() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Convertors convertor = new Convertors();
		String args[]=Convertors.SplitRequestPath(request);
		for (int i=0;i<args.length;i++){
			System.out.println("i "+i+" :"+args[i]);
		}
		int num=10;
		if (args.length > 2) {
			if (args[2] != null) {
				try {
					num = Integer.parseInt(args[2]);
				} catch (Exception et) {
					System.out.println("Cant parse int in args");
					num = 5;
				}
                                if (num >name.length){
                                    num=name.length;
                                }
				ccl = MakeTowns(num);
			}
		}
		request.setAttribute("Data", ccl);
		RequestDispatcher rdjson=request.getRequestDispatcher("/RenderJson");
		rdjson.forward(request,response);
	}

	private LinkedList<Town>  MakeTowns(int num){
		 LinkedList<Town> ttl= new LinkedList();
		 for (int i=0;i<num;i++){
                         int iTown=(int)(name.length*Math.random());
			 Town tt=new Town();

			int Population=(int)(20000+150000*Math.random());
			 tt.setTown(name[iTown],
                                 dLat[iTown],
                                 dLong[iTown],
                                 Population,
                                 county[iTown]);
			 ttl.add(tt);
		 }
		 return ttl;
	}

	 
}
