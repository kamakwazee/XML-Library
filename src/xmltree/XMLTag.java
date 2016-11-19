package xmltree;

/**
 * Creates and Manages an XML Tag
 * @author Tabor Kvasnicka
 *
 */
public class XMLTag
{

    private String tag;
    private String value;

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

    /**
     * Gets the name of the tag
     * @return	the tag
     */
    public String getTagName()
    {

        return tag;

    }

    /**
     * Gets the value of the tag
     * @return	value of the tag
     */
    public String getValue()
    {

        return value;

    }

}
