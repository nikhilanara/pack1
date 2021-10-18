package sample.sample;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.Selectors;
import org.apache.commons.vfs2.UserAuthenticator;
import org.apache.commons.vfs2.VFS;
import org.apache.commons.vfs2.auth.StaticUserAuthenticator;
import org.apache.commons.vfs2.impl.DefaultFileSystemConfigBuilder;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;

public class Missing {
	
	public static void main(String[] args) throws Exception {
		String domain = "10.105.237.43";
		String userName = "Cypresscare\\Bharath.Kumar";
		String password = "Ronda1234#";
//		String remoteFilePath = "\\\\10.0.15.74\\D$\\Suman\\host.txt";
		String remoteFilePath = "file:\\\\atl-file02\\Development\\ManualTeam\\code.txt";
//		String remoteFilePath = "\\\\10.105.237.43\\Development\\ManualTeam\\Sangeetha\\gradle";
		

		File f = new File("C:\\New folder\\text.txt"); // Takes the default path, else, you
											// can specify the required path
		if (f.exists()) {
			f.delete();
		}
		f.createNewFile();
		FileObject destn = VFS.getManager().resolveFile(f.getAbsolutePath());

		// domain, username, password
		UserAuthenticator auth = new StaticUserAuthenticator(domain, userName, password);
		FileSystemOptions opts = new FileSystemOptions();
		DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);

		FileObject fo = VFS.getManager().resolveFile(remoteFilePath, opts);

		System.out.println(fo.exists());

		// fo.createFile();

//		destn.copyFrom(fo, Selectors.SELECT_SELF);
//		destn.close();

		// InputStream is=new FileInputStream(f);
		
		NtlmPasswordAuthentication auth1= new NtlmPasswordAuthentication(domain, userName, password);
		SmbFile smbFile = new SmbFile(remoteFilePath, auth1);
		InputStream in;
		if (smbFile.exists()) {
			in = smbFile.getInputStream();
		}


		
		
		 
	}
	

}
