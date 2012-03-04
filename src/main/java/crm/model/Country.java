package crm.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Country {
    private static final List<Country> COUNTRIES;

    private final String code;
    private final String name;

    static {
        List<Country> temp = new ArrayList<Country>();
        temp.add(new Country("US", "United States"));
        temp.add(new Country("AF", "Afghanistan"));
        temp.add(new Country("AX", "Aland Islands"));
        temp.add(new Country("AL", "Albania"));
        temp.add(new Country("DZ", "Algeria"));
        temp.add(new Country("AS", "American Samoa"));
        temp.add(new Country("AD", "Andorra"));
        temp.add(new Country("AO", "Angola"));
        temp.add(new Country("AI", "Anguilla"));
        temp.add(new Country("AQ", "Antarctica"));
        temp.add(new Country("AG", "Antigua and Barbuda"));
        temp.add(new Country("AR", "Argentina"));
        temp.add(new Country("AM", "Armenia"));
        temp.add(new Country("AW", "Aruba"));
        temp.add(new Country("AU", "Australia"));
        temp.add(new Country("AT", "Austria"));
        temp.add(new Country("AZ", "Azerbaijan"));
        temp.add(new Country("BS", "Bahamas"));
        temp.add(new Country("BH", "Bahrain"));
        temp.add(new Country("BD", "Bangladesh"));
        temp.add(new Country("BB", "Barbados"));
        temp.add(new Country("BY", "Belarus"));
        temp.add(new Country("BE", "Belgium"));
        temp.add(new Country("BZ", "Belize"));
        temp.add(new Country("BJ", "Benin"));
        temp.add(new Country("BM", "Bermuda"));
        temp.add(new Country("BT", "Bhutan"));
        temp.add(new Country("BO", "Bolivia, Plurinational State of"));
        temp.add(new Country("BA", "Bosnia and Herzegovina"));
        temp.add(new Country("BW", "Botswana"));
        temp.add(new Country("BV", "Bouvet Island"));
        temp.add(new Country("BR", "Brazil"));
        temp.add(new Country("IO", "British Indian Ocean Territory"));
        temp.add(new Country("BN", "Brunei Darussalam"));
        temp.add(new Country("BG", "Bulgaria"));
        temp.add(new Country("BF", "Burkina Faso"));
        temp.add(new Country("BI", "Burundi"));
        temp.add(new Country("KH", "Cambodia"));
        temp.add(new Country("CM", "Cameroon"));
        temp.add(new Country("CA", "Canada"));
        temp.add(new Country("CV", "Cape Verde"));
        temp.add(new Country("KY", "Cayman Islands"));
        temp.add(new Country("CF", "Central African Republic"));
        temp.add(new Country("TD", "Chad"));
        temp.add(new Country("CL", "Chile"));
        temp.add(new Country("CN", "China"));
        temp.add(new Country("CX", "Christmas Island"));
        temp.add(new Country("CC", "Cocos (Keeling) Islands"));
        temp.add(new Country("CO", "Colombia"));
        temp.add(new Country("KM", "Comoros"));
        temp.add(new Country("CG", "Congo"));
        temp.add(new Country("CD", "Congo, the Democratic Republic of the"));
        temp.add(new Country("CK", "Cook Islands"));
        temp.add(new Country("CR", "Costa Rica"));
        temp.add(new Country("CI", "Cote d'Ivoire"));
        temp.add(new Country("HR", "Croatia"));
        temp.add(new Country("CU", "Cuba"));
        temp.add(new Country("CY", "Cyprus"));
        temp.add(new Country("CZ", "Czech Republic"));
        temp.add(new Country("DK", "Denmark"));
        temp.add(new Country("DJ", "Djibouti"));
        temp.add(new Country("DM", "Dominica"));
        temp.add(new Country("DO", "Dominican Republic"));
        temp.add(new Country("EC", "Ecuador"));
        temp.add(new Country("EG", "Egypt"));
        temp.add(new Country("SV", "El Salvador"));
        temp.add(new Country("GQ", "Equatorial Guinea"));
        temp.add(new Country("ER", "Eritrea"));
        temp.add(new Country("EE", "Estonia"));
        temp.add(new Country("ET", "Ethiopia"));
        temp.add(new Country("FK", "Falkland Islands (Malvinas)"));
        temp.add(new Country("FO", "Faroe Islands"));
        temp.add(new Country("FJ", "Fiji"));
        temp.add(new Country("FI", "Finland"));
        temp.add(new Country("FR", "France"));
        temp.add(new Country("GF", "French Guiana"));
        temp.add(new Country("PF", "French Polynesia"));
        temp.add(new Country("TF", "French Southern Territories"));
        temp.add(new Country("GA", "Gabon"));
        temp.add(new Country("GM", "Gambia"));
        temp.add(new Country("GE", "Georgia"));
        temp.add(new Country("DE", "Germany"));
        temp.add(new Country("GH", "Ghana"));
        temp.add(new Country("GI", "Gibraltar"));
        temp.add(new Country("GR", "Greece"));
        temp.add(new Country("GL", "Greenland"));
        temp.add(new Country("GD", "Grenada"));
        temp.add(new Country("GP", "Guadeloupe"));
        temp.add(new Country("GU", "Guam"));
        temp.add(new Country("GT", "Guatemala"));
        temp.add(new Country("GG", "Guernsey"));
        temp.add(new Country("GN", "Guinea"));
        temp.add(new Country("GW", "Guinea-Bissau"));
        temp.add(new Country("GY", "Guyana"));
        temp.add(new Country("HT", "Haiti"));
        temp.add(new Country("HM", "Heard Island and McDonald Islands"));
        temp.add(new Country("VA", "Holy See (Vatican City State)"));
        temp.add(new Country("HN", "Honduras"));
        temp.add(new Country("HK", "Hong Kong"));
        temp.add(new Country("HU", "Hungary"));
        temp.add(new Country("IS", "Iceland"));
        temp.add(new Country("IN", "India"));
        temp.add(new Country("ID", "Indonesia"));
        temp.add(new Country("IR", "Iran, Islamic Republic of"));
        temp.add(new Country("IQ", "Iraq"));
        temp.add(new Country("IE", "Ireland"));
        temp.add(new Country("IM", "Isle of Man"));
        temp.add(new Country("IL", "Israel"));
        temp.add(new Country("IT", "Italy"));
        temp.add(new Country("JM", "Jamaica"));
        temp.add(new Country("JP", "Japan"));
        temp.add(new Country("JE", "Jersey"));
        temp.add(new Country("JO", "Jordan"));
        temp.add(new Country("KZ", "Kazakhstan"));
        temp.add(new Country("KE", "Kenya"));
        temp.add(new Country("KI", "Kiribati"));
        temp.add(new Country("KP", "Korea, Democratic People's Republic of"));
        temp.add(new Country("KR", "Korea, Republic of"));
        temp.add(new Country("KW", "Kuwait"));
        temp.add(new Country("KG", "Kyrgyzstan"));
        temp.add(new Country("LA", "Lao People's Democratic Republic"));
        temp.add(new Country("LV", "Latvia"));
        temp.add(new Country("LB", "Lebanon"));
        temp.add(new Country("LS", "Lesotho"));
        temp.add(new Country("LR", "Liberia"));
        temp.add(new Country("LY", "Libyan Arab Jamahiriya"));
        temp.add(new Country("LI", "Liechtenstein"));
        temp.add(new Country("LT", "Lithuania"));
        temp.add(new Country("LU", "Luxembourg"));
        temp.add(new Country("MO", "Macao"));
        temp.add(new Country("MK", "Macedonia, the former Yugoslav Republic of"));
        temp.add(new Country("MG", "Madagascar"));
        temp.add(new Country("MW", "Malawi"));
        temp.add(new Country("MY", "Malaysia"));
        temp.add(new Country("MV", "Maldives"));
        temp.add(new Country("ML", "Mali"));
        temp.add(new Country("MT", "Malta"));
        temp.add(new Country("MH", "Marshall Islands"));
        temp.add(new Country("MQ", "Martinique"));
        temp.add(new Country("MR", "Mauritania"));
        temp.add(new Country("MU", "Mauritius"));
        temp.add(new Country("YT", "Mayotte"));
        temp.add(new Country("MX", "Mexico"));
        temp.add(new Country("FM", "Micronesia, Federated States of"));
        temp.add(new Country("MD", "Moldova, Republic of"));
        temp.add(new Country("MC", "Monaco"));
        temp.add(new Country("MN", "Mongolia"));
        temp.add(new Country("ME", "Montenegro"));
        temp.add(new Country("MS", "Montserrat"));
        temp.add(new Country("MA", "Morocco"));
        temp.add(new Country("MZ", "Mozambique"));
        temp.add(new Country("MM", "Myanmar"));
        temp.add(new Country("NA", "Namibia"));
        temp.add(new Country("NR", "Nauru"));
        temp.add(new Country("NP", "Nepal"));
        temp.add(new Country("NL", "Netherlands"));
        temp.add(new Country("AN", "Netherlands Antilles"));
        temp.add(new Country("NC", "New Caledonia"));
        temp.add(new Country("NZ", "New Zealand"));
        temp.add(new Country("NI", "Nicaragua"));
        temp.add(new Country("NE", "Niger"));
        temp.add(new Country("NG", "Nigeria"));
        temp.add(new Country("NU", "Niue"));
        temp.add(new Country("NF", "Norfolk Island"));
        temp.add(new Country("MP", "Northern Mariana Islands"));
        temp.add(new Country("NO", "Norway"));
        temp.add(new Country("OM", "Oman"));
        temp.add(new Country("PK", "Pakistan"));
        temp.add(new Country("PW", "Palau"));
        temp.add(new Country("PS", "Palestinian Territory, Occupied"));
        temp.add(new Country("PA", "Panama"));
        temp.add(new Country("PG", "Papua New Guinea"));
        temp.add(new Country("PY", "Paraguay"));
        temp.add(new Country("PE", "Peru"));
        temp.add(new Country("PH", "Philippines"));
        temp.add(new Country("PN", "Pitcairn"));
        temp.add(new Country("PL", "Poland"));
        temp.add(new Country("PT", "Portugal"));
        temp.add(new Country("PR", "Puerto Rico"));
        temp.add(new Country("QA", "Qatar"));
        temp.add(new Country("RE", "Reunion"));
        temp.add(new Country("RO", "Romania"));
        temp.add(new Country("RU", "Russian Federation"));
        temp.add(new Country("RW", "Rwanda"));
        temp.add(new Country("BL", "Saint Barthélemy"));
        temp.add(new Country("SH", "Saint Helena"));
        temp.add(new Country("KN", "Saint Kitts and Nevis"));
        temp.add(new Country("LC", "Saint Lucia"));
        temp.add(new Country("MF", "Saint Martin (French part)"));
        temp.add(new Country("PM", "Saint Pierre and Miquelon"));
        temp.add(new Country("VC", "Saint Vincent and the Grenadines"));
        temp.add(new Country("WS", "Samoa"));
        temp.add(new Country("SM", "San Marino"));
        temp.add(new Country("ST", "Sao Tome and Principe"));
        temp.add(new Country("SA", "Saudi Arabia"));
        temp.add(new Country("SN", "Senegal"));
        temp.add(new Country("RS", "Serbia"));
        temp.add(new Country("SC", "Seychelles"));
        temp.add(new Country("SL", "Sierra Leone"));
        temp.add(new Country("SG", "Singapore"));
        temp.add(new Country("SK", "Slovakia"));
        temp.add(new Country("SI", "Slovenia"));
        temp.add(new Country("SB", "Solomon Islands"));
        temp.add(new Country("SO", "Somalia"));
        temp.add(new Country("ZA", "South Africa"));
        temp.add(new Country("GS", "South Georgia and the South Sandwich Islands"));
        temp.add(new Country("ES", "Spain"));
        temp.add(new Country("LK", "Sri Lanka"));
        temp.add(new Country("SD", "Sudan"));
        temp.add(new Country("SR", "Suriname"));
        temp.add(new Country("SJ", "Svalbard and Jan Mayen"));
        temp.add(new Country("SZ", "Swaziland"));
        temp.add(new Country("SE", "Sweden"));
        temp.add(new Country("CH", "Switzerland"));
        temp.add(new Country("SY", "Syrian Arab Republic"));
        temp.add(new Country("TW", "Taiwan, Province of China"));
        temp.add(new Country("TJ", "Tajikistan"));
        temp.add(new Country("TZ", "Tanzania, United Republic of"));
        temp.add(new Country("TH", "Thailand"));
        temp.add(new Country("TL", "Timor-Leste"));
        temp.add(new Country("TG", "Togo"));
        temp.add(new Country("TK", "Tokelau"));
        temp.add(new Country("TO", "Tonga"));
        temp.add(new Country("TT", "Trinidad and Tobago"));
        temp.add(new Country("TN", "Tunisia"));
        temp.add(new Country("TR", "Turkey"));
        temp.add(new Country("TM", "Turkmenistan"));
        temp.add(new Country("TC", "Turks and Caicos Islands"));
        temp.add(new Country("TV", "Tuvalu"));
        temp.add(new Country("UG", "Uganda"));
        temp.add(new Country("UA", "Ukraine"));
        temp.add(new Country("AE", "United Arab Emirates"));
        temp.add(new Country("GB", "United Kingdom"));
        temp.add(new Country("UM", "United States Minor Outlying Islands"));
        temp.add(new Country("UY", "Uruguay"));
        temp.add(new Country("UZ", "Uzbekistan"));
        temp.add(new Country("VU", "Vanuatu"));
        temp.add(new Country("VE", "Venezuela, Bolivarian Republic of"));
        temp.add(new Country("VN", "Viet Nam"));
        temp.add(new Country("VG", "Virgin Islands, British"));
        temp.add(new Country("VI", "Virgin Islands, U.S."));
        temp.add(new Country("WF", "Wallis and Futuna"));
        temp.add(new Country("EH", "Western Sahara"));
        temp.add(new Country("YE", "Yemen"));
        temp.add(new Country("ZM", "Zambia"));
        temp.add(new Country("ZW", "Zimbabwe"));
        COUNTRIES = Collections.unmodifiableList(temp);
    }

    public static List<Country> getCountries() { return COUNTRIES; }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }

    public String getName() { return name; }
}