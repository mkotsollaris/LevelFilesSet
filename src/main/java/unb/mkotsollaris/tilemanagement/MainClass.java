package unb.mkotsollaris.tilemanagement;

import java.io.IOException;

class MainClass
{
    public static void main(String[] args) throws IOException
    {
        String tileDataSetPath = MyFileNames.TileDatasetPath.getFileName();
        String lookupFilePath = MyFileNames.LookupFilePath.getFileName();
        String tileDataFilePath = MyFileNames.TileDataFilePath.getFileName();
        FileNames
                fileNames =
                new FileNames.Builder(tileDataSetPath, lookupFilePath,
                                      tileDataFilePath).build();
        LevelFilesSet
                levelFilesSet =
                new LevelFilesSet.Builder(fileNames).build();
        Tile tile = levelFilesSet.getTile(1,0,0);
        Utilities.printTile(tile);
    }
}