package com.bignerdranch.android.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class BitmapDialog extends DialogFragment {
    private static final String ARG_PIC = "pic";
    private ImageView mImageView;
    private File mPhotoFile;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_bitmap, null);
        mImageView = (ImageView) v.findViewById(R.id.crime_photobox);

        Bitmap bitmap = getArguments().getParcelable(ARG_PIC);
        mImageView.setImageBitmap(bitmap);
        return new AlertDialog.Builder(getActivity()).setView(v).create();
    }

    public static BitmapDialog newInstance(Bitmap bitmap){
        Bundle args = new Bundle();
        args.putParcelable(ARG_PIC, bitmap);

        BitmapDialog fragment = new BitmapDialog();
        fragment.setArguments(args);
        return fragment;
    }
}
