package com.example.awsaf.medscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;

import com.google.android.gms.vision.barcode.Barcode;

import java.util.List;

import info.androidhive.barcode.BarcodeReader;

public class ScannerActivity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
    }

    @Override
    public void onScanned(Barcode barcode) {

    }

    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }

    @Override
    public void onScanError(String errorMessage) {

    }

    @Override
    public void onCameraPermissionDenied() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
