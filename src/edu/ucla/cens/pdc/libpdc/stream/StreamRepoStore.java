package edu.ucla.cens.pdc.libpdc.stream;

import java.util.List;

import edu.ucla.cens.pdc.libpdc.iApplication;
import edu.ucla.cens.pdc.libpdc.datastructures.DataRecord;
import edu.ucla.cens.pdc.libpdc.exceptions.PDCDatabaseException;

public class StreamRepoStore extends Storage {
	
	public StreamRepoStore(iApplication app, String data_stream_id, Storage app_storage) {
		super(app, data_stream_id);
		_app_data_storage = app_storage;
	}

	@Override
	public String getLastEntry() throws PDCDatabaseException {
		
		return null;
	}

	@Override
	public List<String> getRangeIds() throws PDCDatabaseException {
		return getRangeIds(null, null);
	}

	@Override
	public List<String> getRangeIds(String start) throws PDCDatabaseException {
		return getRangeIds(start, null);
	}

	@Override
	public List<String> getRangeIds(String start, String end)
			throws PDCDatabaseException {
		// If the Application user has provided a storage then fetch the object from there
		// Else use the NameEnumeration functionality of the repo and return the appropriate list
		// of strings
		return null;
	}

	@Override
	public DataRecord getRecord(String id) throws PDCDatabaseException {
		// If the Application user has provided a storage then fetch the object from there
		// In the absence of local storage fetch the object from the repo
		// decrypt information using key decided during the setup and return
		return null;
	}

	@Override
	public boolean insertRecord(DataRecord record) throws PDCDatabaseException {
		// Insert in the local repo after encrypting data with the symmetric 
		// keys decided on setup then insert the user backed storage
		if(_app_data_storage != null) {
			
		}
		return false;
	}
	
	private Storage _app_data_storage = null;

}
