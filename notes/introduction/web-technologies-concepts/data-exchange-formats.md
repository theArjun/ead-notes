---
title: Data Exchange Formats
description: Data Exchange Formats - JSON, XML etc.
---

## XML
- Extensible Markup Langugae
- XML doesnot do anything. It is just an information wrapped in tags.
- XMl was designed to carry data like HTML is to display data.
- XMl tags are not predefined like HTML tags.

### Rules
- All XML tags are case sensitive.
- XMl elements must be properly nested.
- XML attributes values nust be quoted.
- Each XML tags needs to be strictly closed with a close tag whereas
  the rule is not strict in HTML.

### Example
```xml
<country>
    <name>Nepal</name>
    <capital>Kathmandu</capital>
    <region>South Asia</region>
    <neighbor>India</neighbor>
</country>
```


## JSON
- JavaScript Object Notation
- It is a lightweight data-interchange format. 
- It is easy for humans to read and write. 
- It is easy for machines to parse and generate. 
- It is based on a subset of the JavaScript Programming Language.


### Rules
- JSON is case sensitive.
- JSON uses double quotes (") instead of single quotes (') for string values.
- JSON uses a colon (:) instead of an equals (=) for key/value pairs.
- JSON uses a comma (,) instead of a semi-colon (;) for separating values.
- The key should be string, but the values can be any type like number, boolean, object, array, etc.

### Example
```json
{
    "name": "Nepal",
    "capital": "Kathmandu",
    "region": "South Asia",
    "neighbor": "India"
}
```

## JSON vs XML

| JSON                                                | XML                                                                     |
| --------------------------------------------------- | ----------------------------------------------------------------------- |
| It is JavaScript Object Notation                    | It is Extensible markup language                                        |
| It is based on JavaScript language.                 | It is derived from SGML.                                                |
| It is a way of representing objects.                | It is a markup language and uses tag structure to represent data items. |
| It does not provides any support for namespaces.    | It supports namespaces.                                                 |
| It supports array.                                  | It doesn’t supports array.                                              |
| Its files are very easy to read as compared to XML. | Its documents are comparatively difficult to read and interpret.        |
| It doesn’t use end tag.                             | It has start and end tags.                                              |
| It is less secured.                                 | It is more secured than JSON.                                           |
| It doesn’t supports comments.                       | It supports comments.                                                   |
| It supports only UTF-8 encoding.                    | It supports various encoding.                                           |
