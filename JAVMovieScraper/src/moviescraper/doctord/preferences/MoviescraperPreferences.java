package moviescraper.doctord.preferences;


public class MoviescraperPreferences extends Settings {

	enum Key implements Settings.Key {
		writeFanartAndPosters,
		overwriteFanartAndPosters,
		downloadActorImagesToActorFolder,
		extraFanartScrapingEnabled,
		createFolderJpg,
		noMovieNameInImageFiles,
		writeTrailerToFile,
		nfoNamedMovieDotNfo,
		useIAFDForActors,
		sanitizerForFilename, 
		renamerString,
		renameMovieFile,
		scrapeInJapanese,
		promptForUserProvidedURLWhenScraping,
		;

		@Override
		public String getKey() {
			return toString();
		}
	}
	
	public MoviescraperPreferences(){
		super();
		
		//initialize default values that must exist in the settings file
		setSanitizerForFilename(getSanitizerForFilename());
		setRenamerString(getRenamerString());
	}


	public void setOverWriteFanartAndPostersPreference(boolean preferenceValue){
		setBooleanValue(Key.overwriteFanartAndPosters, preferenceValue);
	}

	public boolean getOverWriteFanartAndPostersPreference()
	{
		return getBooleanValue(Key.overwriteFanartAndPosters, true);
	}

	public void setWriteFanartAndPostersPreference(boolean preferenceValue){
		setBooleanValue(Key.writeFanartAndPosters, preferenceValue);
	}



	public void setDownloadActorImagesToActorFolderPreference(boolean preferenceValue)
	{
		setBooleanValue(Key.downloadActorImagesToActorFolder, preferenceValue);
	}

	public boolean getDownloadActorImagesToActorFolderPreference()
	{
		return getBooleanValue(Key.downloadActorImagesToActorFolder, true);
	}

	public boolean getWriteFanartAndPostersPreference() {
		return getBooleanValue(Key.writeFanartAndPosters, true);
	}

	public boolean getExtraFanartScrapingEnabledPreference() {
		return getBooleanValue(Key.extraFanartScrapingEnabled, false);
	}

	public void setExtraFanartScrapingEnabledPreference(boolean preferenceValue){
		setBooleanValue(Key.extraFanartScrapingEnabled, preferenceValue);
	}

	public void setCreateFolderJpgEnabledPreference(boolean preferenceValue) {
		setBooleanValue(Key.createFolderJpg, preferenceValue);

	}

	public boolean getCreateFolderJpgEnabledPreference() {
		return getBooleanValue(Key.createFolderJpg, false);
	}

	public boolean getNoMovieNameInImageFiles(){
		return getBooleanValue(Key.noMovieNameInImageFiles, false);
	}

	public void setNoMovieNameInImageFiles(boolean preferenceValue){
		setBooleanValue(Key.noMovieNameInImageFiles, preferenceValue);
	}

	public boolean getWriteTrailerToFile(){
		return getBooleanValue(Key.writeTrailerToFile, false);
	}

	public void setWriteTrailerToFile(boolean preferenceValue){
		setBooleanValue(Key.writeTrailerToFile, preferenceValue);
	}

	public boolean getNfoNamedMovieDotNfo(){
		return getBooleanValue(Key.nfoNamedMovieDotNfo, false);
	}

	public void setNfoNamedMovieDotNfo(boolean preferenceValue){
		setBooleanValue(Key.nfoNamedMovieDotNfo, preferenceValue);
	}

	public boolean getUseIAFDForActors() {
		return getBooleanValue(Key.useIAFDForActors, false);
	}

	public void setUseIAFDForActors(boolean preferenceValue) {
		setBooleanValue(Key.useIAFDForActors, preferenceValue);
	}

	public String getSanitizerForFilename() {
		return getStringValue(Key.sanitizerForFilename, "[\\\\/:*?\"<>|\\r\\n]|[ ]+$|(?<=[^.])[.]+$|(?<=.{250})(.+)(?=[.]\\p{Alnum}{3}$)");
	}

	public void setSanitizerForFilename(String preferenceValue) {
		setStringValue(Key.sanitizerForFilename, preferenceValue);
	}

	public String getRenamerString() {
		return getStringValue(Key.renamerString, "<TITLE> [<ACTORS>] (<YEAR>) [<ID>]");
	}

	public void setRenamerString(String preferenceValue) {
		setStringValue(Key.renamerString, preferenceValue);
	}

	public boolean getRenameMovieFile() {
		return getBooleanValue(Key.renameMovieFile, false);
	}

	public void setRenameMovieFile(boolean preferenceValue) {
		setBooleanValue(Key.renameMovieFile, preferenceValue);
	}

	public boolean getScrapeInJapanese(){
		return getBooleanValue(Key.scrapeInJapanese, false);
	}

	public void setScrapeInJapanese(boolean preferenceValue){
		setBooleanValue(Key.scrapeInJapanese, preferenceValue);
	}
	
	public boolean getPromptForUserProvidedURLWhenScraping(){
		return getBooleanValue(Key.promptForUserProvidedURLWhenScraping, false);
	}

	public void setPromptForUserProvidedURLWhenScraping(boolean preferenceValue){
		setBooleanValue(Key.promptForUserProvidedURLWhenScraping, preferenceValue);
	}


}
