package au.gov.vic.delwp;

import java.io.InputStream;
import java.util.Properties;

public class XlinkedDatasetContact {

  private final DatasetContact ds;

  public XlinkedDatasetContact(DatasetContact ds) { this.ds = ds; }

  public String getRole() { return ds.role.getRole(); }

	public String getContactXlink(){
    return "local://xml.metadata.get?uuid="+Utils.generateContactUUID(ds.contact.getContactID()); 
	}

	}