package main.scala.model

sealed abstract class State(abbreviation: String)

case object Alabama extends State("AL")
case object Alaska extends State("AK")
case object American_Samoa extends State("AS")
case object Arizona extends State("AZ")
case object Arkansas extends State("AR")
case object California extends State("CA")
case object Colorado extends State("CO")
case object Connecticut extends State("CT")
case object Delaware extends State("DE")
case object District_of_Columbia extends State("DC")
case object Federated_States_of_Micronesia extends State("FM")
case object Florida extends State("FL")
case object Georgia extends State("GA")
case object Guam extends State("GU")
case object Hawaii extends State("HI")
case object Idaho extends State("ID")
case object Illinois extends State("IL")
case object Indiana extends State("IN")
case object Iowa extends State("IA")
case object Kansas extends State("KS")
case object Kentucky extends State("KY")
case object Louisiana extends State("LA")
case object Maine extends State("ME")
case object Marshall_Islands extends State("MH")
case object Maryland extends State("MD")
case object Massachusetts extends State("MA")
case object Michigan extends State("MI")
case object Minnesota extends State("MN")
case object Mississippi extends State("MS")
case object Missouri extends State("MO")
case object Montana extends State("MT")
case object Nebraska extends State("NE")
case object Nevada extends State("NV")
case object New_Hampshire extends State("NH")
case object New_Jersey extends State("NJ")
case object New_Mexico extends State("NM")
case object New_York extends State("NY")
case object North_Carolina extends State("NC")
case object North_Dakota extends State("ND")
case object Northern_Mariana_Islands extends State("MP")
case object Ohio extends State("OH")
case object Oklahoma extends State("OK")
case object Oregon extends State("OR")
case object Palau extends State("PW")
case object Pennsylvania extends State("PA")
case object Puerto_Rico extends State("PR")
case object Rhode_Island extends State("RI")
case object South_Carolina extends State("SC")
case object South_Dakota extends State("SD")
case object Tennessee extends State("TN")
case object Texas extends State("TX")
case object Utah extends State("UT")
case object Vermont extends State("VT")
case object Virgin_Islands extends State("VI")
case object Virginia extends State("VA")
case object Washingto extends State("WA")
case object West_Virginia extends State("WV")
case object Wisconsin extends State("WI")
case object Wyoming extends State("WY")