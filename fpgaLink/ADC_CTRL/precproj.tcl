#project
file mkdir "/media/design/fpga/projects/ADC_CTRL/Precision"
set project_file [file join "/media/design/fpga/projects/ADC_CTRL/Precision" "Precision"]
set project_file $project_file.psp
file delete "/media/design/fpga/projects/ADC_CTRL/Precision/*_temp_*"
if { [file exists $project_file] } {
  open_project $project_file
} else {
  new_project -name Precision -folder "/media/design/fpga/projects/ADC_CTRL/Precision"
}

#implementation
set impl_file [file join "/media/design/fpga/projects/ADC_CTRL/Precision/Precision_impl_ADC_CTRL" "Precision_impl_ADC_CTRL"]
set impl_file $impl_file.psi
if { [file exists $impl_file] } {
  activate_impl -impl Precision_impl_ADC_CTRL
} else {
  new_impl -name Precision_impl_ADC_CTRL
}
set_input_dir "/media/design/fpga/projects/ADC_CTRL"
