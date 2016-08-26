package xmltree;

public class XMLTag
{

    String tag;
    String value;

    public XMLTag(String t)
    {

        tag = t;
        value = null;

    }

    public XMLTag(String t, String v)
    {

        tag = t;
        value = v;

    }

    public String getTagName()
    {

        return tag;

    }

    public String getValue()
    {

        return value;

    }

}
