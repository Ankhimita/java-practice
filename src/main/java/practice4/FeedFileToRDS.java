package practice4;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FeedFileToRDS {


    public static void main(String[] args) throws IOException {

        AmazonS3 s3Client = new AmazonS3Client(new ProfileCredentialsProvider());
        S3Object object = s3Client.getObject(new GetObjectRequest("bucketName", "filePath"));
        InputStream inputStream = object.getObjectContent();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String[] list = null;
        list= bufferedReader.readLine().split("\n");
        System.out.println(Arrays.asList(list));
        inputStream.close();
    }
}
