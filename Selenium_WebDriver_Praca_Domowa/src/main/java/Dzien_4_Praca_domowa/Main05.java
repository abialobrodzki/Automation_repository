package Dzien_4_Praca_domowa;

public class Main05 {
    /**
     * # Ćwiczenia z wyszukiwania xPath
     * Ćwiczeń z xPath nigdy za dużo dlatego warto wykonać zadania na stronie
     * https://topswagcode.com/xpath/.
     * Jest z nimi trochę zabawy.
     */

    // tips xpath:
//     1. Type Selector(A-div): //A   "//plate"
//     2. Type Selector: //A   "//bento"
//     3. Absolute Path Selector: //A/B    "//plate/apple"
//     4. Relative Selector(all element): //*    "//*"
//     5. Relative Selector(all element on any other element): //*/A    "//*/apple"
//     6. Attribute Selector(element with the id attribute): //*[@id='Element ID']     "//*[@id='fancy']"
//     7. Descendant Selector(element inside another element): //A/B    "//plate/apple"
//     8. Descendant & ID Selectors(combine): //*[@id='id']/A     "//*[@id='fancy']/pickle"
//     9. Class Selector(elements by their class): //*[contains(@Attribute,'value')]   "//*[contains(@class,'small')]"
//     10. Specific Attribute Selector: //A[contains(@Attribute,'value')]    "//orange[contains(@class,'small')]"
//     11. Example: "//bento/orange[contains(@class,'small')]"
//     12. | Combinator(Combine selectors): //A|//B      "//plate|//bento"
//     13. Universal Selector(all elements inside of A): //A/*     "//plate/*"
//     14. Adjacent Sibling Selector(all B elements that directly follow A): //A/following-sibling::B      "//plate/following-sibling::apple"
//     15. Adjacent Sibling Selector(all B elements that directly precends A): //A/preceding-sibling::B    "//plate/preceding-sibling::pickle"
//     16. Index Selector(element at given index): (A)[Index]      "(//pickle)[3]"
//     17. Child Selector(direct children of an element): //A/B    "//plate/apple"
//     18. Last selector(the last element inside of another element): last()       "//plate/*[last()]"
//     19. Last selector extra(the last element inside of another element): //A[last()]     "//plate/apple[last()]"
//     20. Last - N selector(the second last element inside of another element): //A[last()-N]  "//*/apple[last()-1]"
//     21. Attribute Selector(all elements that have a specific attribute): //*[@attribute]      "//*[@for]"
//     22. Attribute Selector(all elements that have a specific attribute): //A[@attribute]      "//plate[@for]"
//     23. Attribute Value Selector(all elements that have a specific attribute value): //*[@attribute='value']      "//*[@for="Vitaly"]"
//     24. Multiple Attribute Value Selector(elements that have multiple specific attribute value): //B[@attribute='value' and @otherAttribute='other value']/A   "//plate[@for='Hanna' and @id='fancy']/apple"
//     25. Attribute Starts With Selector(all elements with an attribute value that starts with specific characters): //*[starts-with(@attribute,"value")]   "//*[starts-with(@for,"Sa")]"
//     26. Attribute Ends With Selector( all elements with an attribute value that ends with specific characters): //*[substring(@attribute, string-length(@attribute) - string-length('end text') +1) = 'end text']
//     "//*[substring(@for, string-length(@for) - string-length('ato') +1) = 'ato']"

     // https://topswagcode.com/xpath/
}
